package prueba.Java_React.ProyectoEncuesta.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


//establecemos esta clase como la que se encargara de todo la web security de SpringBoot
@Configuration
public class WebSecurity {
    
    //configuramos las propiedades dentro de nuestro HttpSecurity
    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        //deshabilitamos la autenticacion cuando se utilice un POST en el endpoint users para permitir cualquier request sin la autenticacion
        //http.authorizeRequests((HttpMethod.POST).permitAll().anyRequest().authenticated());

        //seguir buscando como hacer para deshabilitar la autenticacion de los POST En endpoints!!!!!

        return null;//http.csrf(crsf -).disable().authorizeRequests().antMatchers(HttpMethod.POST, "/users").permitAll().anyRequest().authenticated();
    }
}
