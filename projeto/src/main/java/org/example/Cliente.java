package org.example;

public class Cliente {

    // Nome do cliente que será o titular da conta
    private String nome;

    // CPF do cliente que será o titular da conta
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}
