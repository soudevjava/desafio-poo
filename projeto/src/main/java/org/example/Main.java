package org.example;

import org.example.core.Account;
import org.example.core.Client;
import org.example.core.CurrentAccount;
import org.example.core.SavingsAccount;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    static boolean  inCount = true;
    private static Scanner input = new Scanner(System.in);
    private static String view = "Digite sua opção: ";


    public static void main(String[] args)
    {
        var client = new Client("Jose","503.884.510-09");
        var currentAccount = new CurrentAccount(client, "1");
        var savingsAccount = new SavingsAccount(client, currentAccount.getNumber());

        while (inCount)
        {
            try {
                System.out.println(menu());
                System.out.print(view);
                int option = input.nextInt();
                if(option == 0)
                {
                    inCount = false;
                }
                realizations(option,currentAccount,savingsAccount);
                System.out.println();
            }
            catch (Exception ex)
            {
                 System.out.println("Erro ao" + ex.getMessage());
            }
        }
    }

    public static String menu()
    {
        return """
                1 - Realizar Depósito na Conta Corrente
                2 - Realizar Saque na Conta Corrente               
                3 - Consultar o Saldo da Conta Corrente
                4-  Realizar Saque na Conta Poupança
                5-  Realizar Depósito na Conta Poupança
                6 - Ver o Saldo da Conta da Poupança
                7 - Fazer uma Aplicação de Juros na conta Poupança                
                
                """;
    }

    public static int realizations(int option, CurrentAccount currentAccount, SavingsAccount savingsAccount)
    {
        switch(option)
        {
            case 1:
                makeDepositCurrent(currentAccount);
                break;
            case 2:
                makeWithdrawalCurrent(currentAccount);
                break;
            case 3:
                System.out.println(checkBalanceCurrent(currentAccount));;
                break;
            case 4:
                makeDepositSavingAccount(savingsAccount);
                break;
            case 5:
                makeWithdrawalSavingAccount(savingsAccount);
                break;
            case 6:
                System.out.println(checkBalanceCurrentSavingAccount(savingsAccount));;
                break;
            case 7:
                applyInterest(savingsAccount);
                break;
            default:
                System.out.println("Opção inválida");
        }

        return option;
    }




    public static void makeDepositCurrent(CurrentAccount currentAccount) {
        System.out.print("Digite o valor do Depósito: ");
        var value = input.nextDouble();
        currentAccount.deposit(value);
        System.out.println("Depósito Realizado com Sucesso!");
    }

    public static void makeWithdrawalCurrent(CurrentAccount currentAccount)
    {
        System.out.print("Digite o valor de Saque: ");
        var value = input.nextDouble();
        currentAccount.withdraw(value);
        System.out.println("Saque Realizado com sucesso!");
    }

    public static BigDecimal checkBalanceCurrent(CurrentAccount currentAccount)
    {
        return currentAccount.viewBalance();
    }

    private static void makeDepositSavingAccount(SavingsAccount savingsAccount)
    {
        System.out.print("Digite o valor do Deposito da Conta Poupança: ");
        var value = input.nextDouble();
        savingsAccount.deposit(value);
        System.out.println("Depósito Realizado da Poupança com Sucesso!");
    }

    public static void makeWithdrawalSavingAccount(SavingsAccount savingsAccount)
    {
        System.out.print("Digite o valor de Saque da Conta Poupança: ");
        var value = input.nextDouble();
        savingsAccount.withdraw(value);
        System.out.println("Saque Realizado da Poupança com sucesso!");
    }

    public static BigDecimal checkBalanceCurrentSavingAccount(SavingsAccount savingsAccount)
    {
        return savingsAccount.viewBalance();
    }

    private static void applyInterest(SavingsAccount savingsAccount)
    {
        System.out.print("Digite o valor pra Depósito pra Aplicação de Juros: ");
        var value = input.nextDouble();
        savingsAccount.incomeInterest(value);
        System.out.println("Depósito Da Aplicação de Juros Realizado com sucesso!");

    }
}