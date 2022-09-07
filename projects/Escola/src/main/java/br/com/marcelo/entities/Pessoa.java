package br.com.marcelo.entities;

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
}
