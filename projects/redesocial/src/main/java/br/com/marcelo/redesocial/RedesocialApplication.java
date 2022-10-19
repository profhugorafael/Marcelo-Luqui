package br.com.marcelo.redesocial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Cacheable;

@SpringBootApplication
public class RedesocialApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedesocialApplication.class, args);
    }

}
