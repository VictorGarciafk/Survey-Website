package prueba.Java_React.ProyectoEncuesta.Services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import prueba.Java_React.ProyectoEncuesta.entities.UserEntity;
import prueba.Java_React.ProyectoEncuesta.models.request.UserRegisterRequestModel;
import prueba.Java_React.ProyectoEncuesta.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserServices {

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
            this.userRepository = userRepository;
    }

    @Override
    public UserEntity createUser(UserRegisterRequestModel user) {

        UserEntity userEntity = new UserEntity();

        BeanUtils.copyProperties(user, userEntity);

        userEntity.setEncryptedPassword(user.getPassword());

        return userRepository.save(userEntity);
    }
    
}
