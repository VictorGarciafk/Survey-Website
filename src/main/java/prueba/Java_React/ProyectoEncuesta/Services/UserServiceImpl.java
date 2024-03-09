package prueba.Java_React.ProyectoEncuesta.Services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import prueba.Java_React.ProyectoEncuesta.entities.UserEntity;
import prueba.Java_React.ProyectoEncuesta.models.request.UserRegisterRequestModel;
import prueba.Java_React.ProyectoEncuesta.repositories.UserRepository;

//establecemos esta clase como un servicio para que springboot permita inyectarlo en otras clases
@Service
//implementamos los metodos de la interfaz UserServices
public class UserServiceImpl implements UserServices {

    UserRepository userRepository;

    //inyectamos la clase UserServiceImp mediante el constructor
    public UserServiceImpl(UserRepository userRepository){
            this.userRepository = userRepository;
    }

    @Override
    public UserEntity createUser(UserRegisterRequestModel user) {
        //Creamos el objeto UserEntity
        UserEntity userEntity = new UserEntity();

        //copiamos todas las propiedades de UserRegisterRequestModel al UserEntity
        BeanUtils.copyProperties(user, userEntity);

        //al no coincidir la constraseña por la diferencia del nombre de las variables, obtenemos la contraseña en el userEntity
        userEntity.setEncryptedPassword(user.getPassword());

        //retornamos la accion de guardar los datos del userEntity en la base de datos
        return userRepository.save(userEntity);
    }
    
}
