package prueba.Java_React.ProyectoEncuesta.models.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

//generamos los getters y setters de los strings name, email y password
@Data
public class UserRegisterRequestModel {

    //le damos la propiedad a la variable "nombre" que no tiene que ser vacio
    @NotEmpty
    private String name;

    //le damos la propiedad a la variable "email" que no tiene que ser vacio y que es un Email
    @NotEmpty
    @Email
    private String email;

    //le damos la propiedad a la variable "password" que no tiene que ser vacio y que tiene que ser entre 8 y 40 caracteres
    @NotEmpty
    @Size(min = 8, max = 40)
    private String password;
}
