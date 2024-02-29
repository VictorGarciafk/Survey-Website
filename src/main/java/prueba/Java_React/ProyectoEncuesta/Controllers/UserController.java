package prueba.Java_React.ProyectoEncuesta.Controllers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import prueba.Java_React.ProyectoEncuesta.models.request.UserRegisterRequestModel;



//Recibe peticiones HTTP y devuelve una respuesta
@RestController
//asignamos cual va a ser la ruta del controlador
@RequestMapping("/users")
public class UserController {
    //POST(se utiliza para crear recursos), GET(para obtener recursos), 
    //DELETE(para eliminar recursos), PUT(para actualizar el recurso), PATCH(se utiliza para actualizar parcialmente el recurso)
    
    //Creamos un nuevo usuario
    @PostMapping()
    public String CreateUser(@RequestBody @Valid UserRegisterRequestModel userModel) {

        return "Create second User";
    }
    
}
