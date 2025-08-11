package org.example.domain.model;

public class ContaCorrente extends Conta{

    private static final double TAXA_SAQUE_PERCENTUAL = 0.5;

    @Override
    public void sacar (double valor) {
        double valorDaTaxa = valor * (TAXA_SAQUE_PERCENTUAL / 100);
        double valorTotalDebitado = valor + valorDaTaxa;

        super.sacar(valorTotalDebitado);
    }

    @Override
    public String getTipoConta() {
        return "Conta Corrente";
    }
}
