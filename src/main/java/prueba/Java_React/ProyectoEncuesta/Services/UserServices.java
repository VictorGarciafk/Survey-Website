package prueba.Java_React.ProyectoEncuesta.Services;

import prueba.Java_React.ProyectoEncuesta.entities.UserEntity;
import prueba.Java_React.ProyectoEncuesta.models.request.UserRegisterRequestModel;

public interface UserServices {
    //regresamos un "UserEntity" con los parametros de UserRegisterRequestModel
    public UserEntity createUser(UserRegisterRequestModel user);
    
}
