package br.com.marcelo.entities;

import java.util.Objects;

public class Pessoa {

    // atributos
    protected String nome;
    protected String apelido;
    protected int idade;
    protected double altura;

    // construtores

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.apelido = nome;
    }

    public Pessoa(String nome, String apelido, int idade, double altura) {
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
        this.altura = altura;
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // metodos
    public String whoAmI() {
        return "Eu sou uma Pessoa";
    }

    public final String whoIBegin() { return "Eu sou uma Pessoa desde sempre"; }

    // toString

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Pessoa pessoa = (Pessoa) other;

        if (idade != pessoa.idade) return false;
        if (Double.compare(pessoa.altura, altura) != 0) return false;
        if (!Objects.equals(nome, pessoa.nome)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (apelido != null ? apelido.hashCode() : 0);
        result = 31 * result + idade;
        temp = Double.doubleToLongBits(altura);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
