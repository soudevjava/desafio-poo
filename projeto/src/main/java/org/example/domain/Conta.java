package org.example.domain;

import java.util.Objects;

public class Conta {
    private static final int LENGTH_NUMERO = 8;
    private static final int LENGTH_MIN = 9999999;
    private static final int LENGTH_MAX = 99999999;

    private final Cliente titular;
    private final int numero;
    private double saldo;

    protected Conta(Cliente titular, int numero) {
        this.titular = Objects.requireNonNull(titular, "Preencha o titular da conta");
        if((numero <= LENGTH_MIN || numero > LENGTH_MAX)) {
            throw new IllegalArgumentException("Número da conta deve possuir " + LENGTH_NUMERO + " dígitos");
        }
        this.numero =  numero;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser positivo");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser positivo");
        }
        if (valor > verSaldo()) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        saldo -= valor;
    }

    public double verSaldo() {
        return this.saldo;
    }
}