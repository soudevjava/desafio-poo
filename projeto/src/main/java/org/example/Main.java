package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        // Criando um cliente
        Cliente cliente = new Cliente("João Silva", "123.456.789-00");
        System.out.printf("Cliente: %s | CPF: %s%n", cliente.getNome(), cliente.getCpf());
      
        
        // Criando contas
        ContaCorrente cc = new ContaCorrente(cliente, 1001);
        ContaPoupanca cp = new ContaPoupanca(cliente, 2001);
        
        // Operações na conta corrente
        System.out.println("\n--- Operações na Conta Corrente ---");
        cc.depositar(1000);
        cc.verSaldo();
        cc.sacar(100);
        cc.verSaldo();
        
        // Operações na conta poupança
        System.out.println("\n--- Operações na Conta Poupança ---");
        cp.depositar(1000);
        cp.verSaldo();
        cp.renderJuros();
        cp.verSaldo();
        cp.sacar(500);
        cp.verSaldo();
    }
   
}