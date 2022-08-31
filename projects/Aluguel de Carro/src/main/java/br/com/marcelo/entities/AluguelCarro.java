package br.com.marcelo.entities;

import java.time.LocalDate;

public class AluguelCarro {

    // atributos
    private LocalDate checkOut;
    private LocalDate checkIn;

    private Carro carroAlugado;

    // construtor padrão
    public AluguelCarro() {
    }

    // construtor personalizado
    public AluguelCarro(LocalDate checkOut, LocalDate checkIn, Carro carroAlugado) {
        this.checkOut = checkOut;
        this.checkIn = checkIn;
        this.carroAlugado = carroAlugado;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public Carro getCarroAlugado() {
        return carroAlugado;
    }

    @Override
    public String toString() {
        return "AluguelCarro{" +
                "checkOut=" + checkOut +
                ", checkIn=" + checkIn +
                ", carroAlugado=" + carroAlugado +
                '}';
    }
}
