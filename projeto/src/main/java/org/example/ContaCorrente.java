package org.example;

public class ContaCorrente extends Conta {

    // Aqui a conta corrente cobra uma taxinha de 0.5% no saque
    private static final double TAXA_SAQUE = 0.005;

    public ContaCorrente(Cliente titular, int numero) {
        super(titular, numero);
    }

    @Override

    // Modelo de saque
    public void sacar(double valor) {
        double taxa = valor * TAXA_SAQUE;
        double total = valor + taxa;

        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        if (total <= saldo) {
            saldo -= total;
            System.out.printf("Saque de R$%.2f + taxa R$%.2f realizado.%n", valor, taxa);
        } else {
            System.out.println("Saldo insuficiente para saque com taxa.");
        }
    }
}
