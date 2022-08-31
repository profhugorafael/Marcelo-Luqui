package br.com.marcelo.entities;

import java.math.BigDecimal;

public class NotaFiscal {

    // private double valor;
    private BigDecimal valorAluguel;
    private BigDecimal valorImposto;

    public NotaFiscal(BigDecimal valorAluguel, BigDecimal valorImposto) {
        this.valorAluguel = valorAluguel;
        this.valorImposto = valorImposto;
    }

    public BigDecimal getValorAluguel() {
        return valorAluguel;
    }

    public BigDecimal getValorImposto() {
        return valorImposto;
    }

    public BigDecimal getValorTotal() {
        // return valorAluguel + valorImposto;
        return valorAluguel.add(valorImposto);
    }
}
