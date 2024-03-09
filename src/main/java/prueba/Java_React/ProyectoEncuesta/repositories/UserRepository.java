package prueba.Java_React.ProyectoEncuesta.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import prueba.Java_React.ProyectoEncuesta.entities.UserEntity;

@Repository
//creamos el repositorio donde podremos usar todos los metodos del CrudRepository
public interface UserRepository extends CrudRepository<UserEntity, Long>{
    
}
