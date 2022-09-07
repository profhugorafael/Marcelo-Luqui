package br.com.marcelo;

import br.com.marcelo.entities.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        int[] sequencia = {1, 2, 3};
//        char[] texto = {'h', 'e', 'l', 'l', 'o'};
//        String texto2 = "hello";
//
//        System.out.println(texto[2]);
//        System.out.println(texto2.charAt(2));

        Integer x = 2; // Double, Character, Float, Boolean

        List<Integer> sequencia = new ArrayList<>();
        List<Aluno> turma = new ArrayList<>();

        turma.add(new Aluno("123A", "Pedro", 19, 1.85));

        sequencia.add(2);
        sequencia.add(3);
        sequencia.add(5);
        sequencia.add(6);

        sequencia.remove( 3);

        // sequencia.forEach(System.out::println);

        for(Integer valor : sequencia) {
            System.out.println(valor);
        }

    }
}