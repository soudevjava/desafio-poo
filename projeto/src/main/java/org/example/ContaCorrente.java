package org.example;
/*
  A class ContaCorrete temos Herança
  ----------------------------------
  */
public class ContaCorrente extends Conta { // Herda todos os membros não-privados do superclass "saldo petected é acessável"
				// Constante de Taxa
	public static final double TAXA_SAQUE = 0.05; // 0.5%
	
	
				// Construtor
	public ContaCorrente(Cliente titular, int numero) {
		super(titular, numero); // Chama explicatamente o construtor da superclass Conta
	}
	
				//SobrEscrita do Métados sacar()
	
	@Override // Garante que está sobreescrevendo corretamento
	public boolean sacar(double valor) {
		System.out.println("Passei aqui");
		double valorComTaxa = valor + (valor * TAXA_SAQUE); // Cálculo do valor total;
		
		
		// Executa a lógica original de saque da "class--> Conta"
	   // Verifica saldo suficiente e valida valor positivo
		if (super.sacar(valorComTaxa)) { // Chamando o método pai
			
			
			// Tratramento do resultado
			System.out.println("Taxa de saque: R$" + valor * TAXA_SAQUE); // Exibe o valor da taxa calculado sobre o valor original
			return true; // Retun confirmação de sucesso.
		} 
		return false; // Propaga a falha sem mensagem adicional (já tratado na superclass.
	}
}
