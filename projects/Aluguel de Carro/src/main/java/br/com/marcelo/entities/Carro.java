package br.com.marcelo.entities;

import java.time.LocalDate;

public class Carro {

    // atributos
    private String dono;
    private String marca;
    private long kilometragem;
    private LocalDate fabricacao;
    private boolean motorLigado;

    // construtor
    public Carro(String dono, String marca, LocalDate fabricacao) {
        this.dono = dono;
        this.marca = marca;
        this.fabricacao = fabricacao;
        this.kilometragem = 0;
        this.motorLigado = false;
    }

    // sobrecarregando o construtor de Carro
    public Carro(String dono, String marca, long kilometragem, LocalDate fabricacao) {
        this.dono = dono;
        this.marca = marca;
        this.kilometragem = kilometragem;
        this.fabricacao = fabricacao;
        this.motorLigado = false;
    }

    // Getters and Setters (controladores de acesso)

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getMarca() {
        return marca;
    }

    public long getKilometragem() {
        return kilometragem;
    }

    public LocalDate getFabricacao() {
        return fabricacao;
    }

    // ainda sera um get, porem por ser true/false ganha o prefixo 'is'
    public boolean isMotorLigado() {
        return motorLigado;
    }

    // métodos
    public void ligarCarro() {
        motorLigado = true;
    }

    public void desligarCarro() {
        motorLigado = false;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "dono='" + dono + "\'\n" +
                ", marca='" + marca + "\'\n" +
                ", kilometragem=" + kilometragem + "\n" +
                ", fabricacao=" + fabricacao + "\n" +
                ", motorLigado=" + motorLigado + "\n" +
                '}';
    }
}
