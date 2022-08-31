package br.com.marcelo;

import br.com.marcelo.entities.Carro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate dataFrabricacao = LocalDate.now();

        System.out.println(dataFrabricacao);

        Carro car1 = new Carro("Joao", "Ford", dataFrabricacao);

        System.out.println(car1);

    }
}