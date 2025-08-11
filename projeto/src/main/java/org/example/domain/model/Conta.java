package org.example.domain.model;

public class Conta {

    private Cliente titular;
    private int numero;
    protected double saldo;

    public Conta(Cliente titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta(Cliente titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public Conta(){}

    public void depositar (double valor) {
        this.saldo += valor;
        System.out.println("Saldo atual (" + getTipoConta() + "): R$" + this.verSaldo());
    }

    public void sacar (double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser positivo.");
            return;
        }

        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saldo atual (" + getTipoConta() + "): R$" + this.verSaldo());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double verSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return "Conta Comum";
    }
}
