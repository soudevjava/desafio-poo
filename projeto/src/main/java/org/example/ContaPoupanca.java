package org.example;

public class ContaPoupanca extends Conta {

    // Simula o rendimento da poupança (1%)
    private static final double TAXA_JUROS = 0.01;

    public ContaPoupanca(Cliente titular, int numero) {
        super(titular, numero);
    }

    @Override

    // Modelo de saque
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        if (valor <= saldo) {
            saldo -= valor;
            adicionarHistorico("Saque de R$" + valor);
            System.out.printf("Saque de R$%.2f realizado.%n", valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    // Rendimento dos Juros
    public void renderJuros() {
        double juros = saldo * TAXA_JUROS;
        saldo += juros;
        adicionarHistorico("Juros de R$" + juros + " aplicados");
        System.out.printf("Juros de R$%.2f aplicados na conta poupança.%n", juros);
    }
}
