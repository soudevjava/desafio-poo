package org.example;

/*
 	
 */
public class ContaPoupanca extends Conta { // Establece relaçao de herança com a class conta
										  // Herda todos os membros não-privaados:
	                                     // Atributos: titular, numero, saldo (este último por ser protected
	
			// Constante de juros
	private static final double TAXA_JUROS = 0.01; // 1%
	/*
	 * private --> Acessível somente dentro da class
	 * static --> Pertence à class, não às instâncias individuais
	 * final ---> Valor imutável apos definição
	 * double --> Tipo adequado para cálculos monetários precisos*/
	
		// Construtor
	
	public ContaPoupanca(Cliente titular, int numero) {
		super(titular, numero);
	/*
	 super(titular, numero) --> Delega a inicialização básico para a class conta
	 saldo --> é difinido como 0.0 pela construtor da superclass
	 titular e numero são armazenado nos respectivos compos
	 */
	}
	
	// Métado Render juros
	public void renderJuros() {
		double juros = saldo * TAXA_JUROS; // Cálculo dos juros
		
		saldo += juros; // Adiciona o valor calculado diretamente ao saldo
		
		System.out.println("Juros de R$ " + juros + " creditados na conta"); // Feedback da Operações
	}
}
