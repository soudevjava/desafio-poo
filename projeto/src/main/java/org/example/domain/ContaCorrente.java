package org.example.domain;

public class ContaCorrente extends Conta {
    private static final double TAXA_SAQUE = 0.005;

    private ContaCorrente(Cliente titular, int numero) {
        super(titular, numero);
    }

    public static ContaCorrente criar(Cliente titular, int numero) {
        return new ContaCorrente(titular, numero);
    }

    @Override
    public void sacar(double valor) {

        double taxacao = valor * TAXA_SAQUE;

         super.sacar(valor + taxacao);

    }
}