package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente ana = new Cliente("Victor Nascimento", "123.456.789-00");
        Cliente carlos = new Cliente("Renato Nóbrega", "987.654.321-00");

        ContaCorrente cc = new ContaCorrente(ana, 1001);
        ContaPoupanca cp = new ContaPoupanca(carlos, 2002);

        System.out.println("=== Operações Conta Corrente ===");
        cc.depositar(1000);
        cc.sacar(200);
        cc.verSaldo();

        System.out.println("\n=== Operações Conta Poupança ===");
        cp.depositar(500);
        cp.renderJuros();
        cp.sacar(100);
        cp.verSaldo();

        System.out.println("\n=== Transferência ===");
        cc.transferir(cp, 300);

        System.out.println("\n=== Extratos ===");
        cc.verExtrato();
        cp.verExtrato();
    }
}
