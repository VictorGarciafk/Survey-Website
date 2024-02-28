package prueba.Java_React.ProyectoEncuesta.Controllers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//Recibe peticiones HTTP y devuelve una respuesta
@RestController
//asignamos cual va a ser la ruta del controlador
@RequestMapping("/users")
public class UserController {
    //POST(se utiliza para crear recursos), GET(para obtener recursos), 
    //DELETE(para eliminar recursos), PUT(para actualizar el recurso), PATCH(se utiliza para actualizar parcialmente el recurso)
    
    //Creamos un nuevo usuario
    @PostMapping()
    public String CreateUser() {

        return "Create second User";
    }
    
}
