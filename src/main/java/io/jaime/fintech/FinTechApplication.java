package io.jaime.fintech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class FinTechApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinTechApplication.class, args);
    }

}
