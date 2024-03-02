package prueba.Java_React.ProyectoEncuesta.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import prueba.Java_React.ProyectoEncuesta.entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long>{
    
}
