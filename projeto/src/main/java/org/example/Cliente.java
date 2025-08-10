package org.example;


/*
 * 					Sistema Bancário com POO - Guia Implementação
 					Class Cliene
 */

public class Cliente {
	// Atributos --> nome e cpf.
	// Private -->Significa que essas informações ficam protegidas. 
	
	private String nome;
	private String cpf;
	
	// Construtor --> Seria o método que cria um novo cliente.
	public Cliente(String nome, String cpf) {
		// this --> A classe que guarda esse informações. [this.nome = nome]
		this.nome = nome;
		this.cpf = cpf;
	}
	
	// Esse métodos são como atendentes que te dão as informações quando precisa:
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	
}
