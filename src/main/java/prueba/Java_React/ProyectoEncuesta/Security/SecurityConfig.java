package prueba.Java_React.ProyectoEncuesta.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        http.cors(customizer -> customizer.disable());
        http.csrf(customizer -> customizer.disable());
        http.authorizeHttpRequests(
            auth -> auth.requestMatchers(HttpMethod.POST, "/users")
            .permitAll()
            .anyRequest()
            .authenticated()
        );
        //http.formLogin(Customizer.withDefaults());
        //http.httpBasic(Customizer.withDefaults());

        return http.build();
    }

    //@Bean
    //public AuthenticationProvider authProvider(){
    //    DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
    //    provider.setPasswordEncoder(new BCryptPasswordEncoder());
    //}

    @Bean
    public AuthenticationManager authManager(AuthenticationConfiguration config) throws Exception {

        return config.getAuthenticationManager();
    }

    
}
