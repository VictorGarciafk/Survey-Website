package prueba.Java_React.ProyectoEncuesta.models.request.responses;

import lombok.Data;

//Creamos la clase donde tendremos solo los datos que queremos que se muestren al usuario
@Data
public class UserRest {
    private long id;

    private String name;

    private String email;
}
