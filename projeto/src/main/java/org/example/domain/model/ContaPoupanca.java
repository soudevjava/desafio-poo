package org.example.domain.model;

public class ContaPoupanca extends Conta{

    private static final double TAXA_JUROS_PERCENTUAL = 1.0;

    public void renderJuros () {
        double valorDoJuro = this.saldo * (TAXA_JUROS_PERCENTUAL / 100);
        this.saldo += valorDoJuro;
    }

    @Override
    public String getTipoConta() {
        return "Conta Poupança";
    }
}
