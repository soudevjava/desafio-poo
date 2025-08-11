package org.example;

import org.example.domain.model.Cliente;
import org.example.domain.model.Conta;
import org.example.domain.model.ContaCorrente;
import org.example.domain.model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente jean = new Cliente("jean", "12345678900");
        Conta conta1 = new Conta(jean, 123);

        ContaCorrente contaCorrente1 = new ContaCorrente();
        ContaPoupanca contaPoupanca1 = new ContaPoupanca();

        Conta[] contas = {conta1, contaCorrente1, contaPoupanca1};

        for (Conta conta : contas) {
            conta.depositar(200.0);
        }

        System.out.println("------------------");

        for (Conta conta : contas) {
            conta.sacar(50.0);
        }

        contaPoupanca1.renderJuros();

        System.out.println("\n--- Saldo Final das Contas ---");
        for (Conta conta : contas) {
            System.out.println(conta.getTipoConta() + ": R$" + conta.verSaldo());
        }
    }
}