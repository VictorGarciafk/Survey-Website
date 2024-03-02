package prueba.Java_React.ProyectoEncuesta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//le damos la propiedad de entidad a la clase que pertenecera a la tabla "users" de la base de datos
@Entity(name="users")
//nos generada getters y setterss a todos los campos en nuestra clase
@Data
public class UserEntity {
    
    //asignamos el id de la tabla user
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //asignamos el nombre de la tabla user
    @Column(nullable = false, length = 255)
    private String name;

    //asignamos el email de la tabla user
    @Column(nullable = false, length = 255)
    private String email;

    //asignamos la contraseña encriptada de la tabla user
    @Column(nullable = false)
    private String encryptedPassword;


    //si no tuvieramos el @data se tendria que asignar de forma manual los getters y setters
    /*public void SetId(Long id){
        this.id = id;
    }

    public long GetID(){
        return this.id;
    }
    */
}
