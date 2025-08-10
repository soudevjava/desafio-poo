package org.example;

/*
 * 						Class Conta
 */
public class Conta {
	// Atributos
	private Cliente titular; // Armazena o objeto Cliente associado a esta conta
	private int numero;      // Guarda o numero único da conta
	protected double saldo; // protected serve para acessar outras class "SubClass"
	
	// Construtor
	public Conta(Cliente titular, int numero) {
		this.titular = titular; // Associa um cliente como titular
		this.numero = numero;  // Define o numero da conta
		this.saldo = 0.0;	  // Inicializa saldo como zero 
	}
	
	
	// Métodos Desopitar()
	public void depositar(double valor) {
		if (valor > 0) {     // Verfica se valor é positivo
			saldo += valor; // Adiciona ao saldo  
			System.out.println("Depositar de R$ " + valor + " realizado com sucesso" );
		} else {
			System.out.println("Valor de deposito Inválido!");
		}
	}
	
	// Método Sacar
	public boolean sacar(double valor) {
		if (valor > 0 && saldo >= valor) {                                      // Verificar se valor é positivo e há saldo
			saldo -= valor;                                                    // Subtrai do saldo   
			System.out.println("Saque de R$ " + valor + " realiza com sucesso.");// Mensagem foi aprovado.
			return true;													  // Return sucesso
		} else {
			System.out.println("Saldo insuficiente ou valor inválido!"); // Mensagem de erro
			return false;                                               // Return falha
		}
			
	}
	// Método verSaldo
	public void verSaldo() {
		System.out.println("Saldo atual: R$ " + saldo); //Exibe saldo no console
	}
	
	// Getts 
	public Cliente getTitular() { 
		return titular;  // Return o objeto Cliente
	}
	public int getNumero() {
		return numero; // Return número da conta
	
	}
	public double getSaldo() {
		return saldo; // Return valor do saldo
	}
	
}
