package org.example;

import org.example.domain.Cliente;
import org.example.domain.ContaCorrente;
import org.example.domain.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        final String CLIENTE_NOME = "Christian Ely";
        final String CLIENTE_CPF = "12345678901";
        final int CONTA_NUMERO = 12345678;
        final double CORRENTE_DEPOSITAR = 200.00;
        final double CORRENTE_SACAR = 100.00;
        final double POUPANCA_DEPOSITAR = 100.00;

        try {
            Cliente cliente = Cliente.criar(CLIENTE_NOME, CLIENTE_CPF);
            ContaCorrente contaCorrente = ContaCorrente.criar(cliente, CONTA_NUMERO);
            ContaPoupanca contaPoupanca = ContaPoupanca.criar(cliente, CONTA_NUMERO);

            contaCorrente.depositar(CORRENTE_DEPOSITAR);
            contaCorrente.sacar(CORRENTE_SACAR);
            double saldoCorrente = contaCorrente.verSaldo();

            System.out.println("Saldo Conta Corrente: " + saldoCorrente);

            contaPoupanca.depositar(POUPANCA_DEPOSITAR);
            contaPoupanca.renderJuros();
            double saldoPoupanca = contaPoupanca.verSaldo();

            System.out.println("Saldo Conta Poupança: " + saldoPoupanca);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}