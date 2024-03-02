package prueba.Java_React.ProyectoEncuesta.models.request.responses;

import java.util.Date;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

//creamos el objeto donde se almacenaran los errores y la hora del error
@Data
//se le daran todos los argumentos a los getters y setterss
@AllArgsConstructor
public class ValidationErrors {

    private Map<String, String> errors;

    private Date timeStamp;
}
