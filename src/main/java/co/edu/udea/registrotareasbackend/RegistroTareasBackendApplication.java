package co.edu.udea.registrotareasbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RegistroTareasBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistroTareasBackendApplication.class, args);
    }

}
