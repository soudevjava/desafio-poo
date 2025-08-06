package org.example.domain;

public class ContaPoupanca extends Conta {
    private static final double JUROS = 0.01;

    private ContaPoupanca(Cliente titular, int numero) {
        super(titular, numero);
    }

    public static ContaPoupanca criar(Cliente titular, int numero) {
        return new ContaPoupanca(titular, numero);
    }

    public void renderJuros() {
        double atual = verSaldo();

        if (atual > 0) {
            double saldo = atual * JUROS;
            depositar(saldo);
        }
    }
}
