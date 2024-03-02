package prueba.Java_React.ProyectoEncuesta.exceptions;

import java.util.Date;
import java.util.HashMap;

import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import prueba.Java_React.ProyectoEncuesta.models.request.responses.ValidationErrors;

//con la anotacion ControllerAdvice hacemos que la clase administre las excepciones de la aplicacion
@ControllerAdvice
public class AppExceptionHandler {
    
    //el programa entrara en esta clase cuando el argumento @valid en alguna clase falle para devolver un mensaje con los requisitos necesarios
    @ExceptionHandler(value = { MethodArgumentNotValidException.class})
    //se obtendra la respuesta del HTTP acerca de la validacion y la ruta de la solicitud(Request)(pagina web) etc.,
    public ResponseEntity<Object> handleValidationErrorExceptiopn(MethodArgumentNotValidException ex, WebRequest webRequest){

        //
        Map<String, String> errors = new HashMap<>();    

        //almacenamos los errores que haya arrojado los problemas de la validacion
        for(ObjectError error : ex.getBindingResult().getAllErrors()){
            
            //obtenemos el nombre de o los campos el cual da el error, ej: "nombre", "email" etc
            String fieldName = ((FieldError) error).getField();
            //obtenemos el mensaje de error, ej: el campo no debe estar vacio
            String errorMessage = error.getDefaultMessage();
            //insertamos los datos en un Map en orden
            errors.put(fieldName, errorMessage);
        }

        //creamos el objeto donde se almacenaran el error y la fecha y hora del error que queremos enviar
        ValidationErrors validationErrors = new ValidationErrors(errors, new Date());

        //retornamos la respuesta del HTTP con los errores obtenidos dentro del objeto que vienen del error "Bad request"
        //"recordatorio de llenar mas la documentacion"
        return new ResponseEntity<>(validationErrors, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }
}
