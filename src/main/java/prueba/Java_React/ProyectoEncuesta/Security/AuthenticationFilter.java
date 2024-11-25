package prueba.Java_React.ProyectoEncuesta.Security;

import javax.naming.AuthenticationException;

import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;

public interface AuthenticationFilter {

    Authentication authenticated(Authentication auth) throws AuthenticationException;
}
