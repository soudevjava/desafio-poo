package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe base para qualquer tipo de conta (corrente ou poupança)
// Aqui eu coloquei os métodos comuns, como depositar e ver saldo

public abstract class Conta {
    private Cliente titular;
    private int numero;
    protected double saldo;
    private List<String> historico = new ArrayList<>();

    public Conta(Cliente titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }

    // Modelo de Deposito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            adicionarHistorico("Depósito de R$" + valor);
            System.out.println("Depósito de R$" + valor + " realizado.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }


    // Cada tipo de conta vai ter seu jeito de sacar, então deixei abstrato
    public abstract void sacar(double valor);

    public void verSaldo() {
        System.out.printf("Conta %d | Titular: %s | Saldo: R$%.2f%n", numero, titular.getNome(), saldo);
    }

    // Modelo de Transferencia
    public void transferir(Conta destino, double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para transferência.");
            return;
        }

        if (valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);

            adicionarHistorico("Transferido R$" + valor + " para conta " + destino.getNumero());
            destino.adicionarHistorico("Recebido R$" + valor + " da conta " + this.getNumero());
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    // Modelo para ver o Extrato
    public void verExtrato() {
        System.out.println("\n=== Extrato da Conta " + numero + " ===");
        for (String operacao : historico) {
            System.out.println(" - " + operacao);
        }
        System.out.printf("Saldo atual: R$%.2f%n", saldo);
    }

    protected void adicionarHistorico(String operacao) {
        historico.add(operacao);
    }

    public Cliente getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
