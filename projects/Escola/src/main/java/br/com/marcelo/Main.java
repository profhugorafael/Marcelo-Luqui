package br.com.marcelo;

import br.com.marcelo.entities.Aluno;
import br.com.marcelo.entities.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        int[] sequencia = {1, 2, 3};
//        char[] texto = {'h', 'e', 'l', 'l', 'o'};
//        String texto2 = "hello";
//
//        System.out.println(texto[2]);
//        System.out.println(texto2.charAt(2));

        List<Aluno> turma = new ArrayList<>();

        turma.add(new Aluno("123A", "Pedro", 19, 1.85));
        turma.add(new Aluno("123C", "Beatriz", 22, 1.85));
        turma.add(new Aluno("123B", "Lucas", 20, 1.85));
        turma.add(new Aluno("123D", "Maria", 18, 1.85));
        turma.add(new Aluno("123E", "Beatriz", 24, 1.85));

        turma.sort(Comparator.comparingInt(Pessoa::getIdade));

//        Aluno maior = null;

//        for(Aluno aluno : turma) {
//            if (maior == null) {
//                maior = aluno;
//            } else {
//                if (maior.compareTo(aluno) > 0) {
//                    maior = aluno;
//                }
//            }
//
//            System.out.println(maior);
//        }

        System.out.println("---------------------");

       turma.forEach(System.out::println);

    }
}