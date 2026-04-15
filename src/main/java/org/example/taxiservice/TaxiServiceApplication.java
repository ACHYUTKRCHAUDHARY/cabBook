package org.example.taxiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TaxiServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaxiServiceApplication.class, args);
    }

}
