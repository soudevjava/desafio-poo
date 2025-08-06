package org.example.domain;

import java.util.Objects;

public class Cliente {
    private static final int LENGTH_CPF = 11;

    private final String nome;
    private final String cpf;

    private Cliente(String nome, String cpf) {
        this.nome = Objects.requireNonNull(nome, "Preencha o nome");
        if(cpf.length() != LENGTH_CPF) {
            throw new IllegalArgumentException("Número da CPF deve possuir " + LENGTH_CPF + " dígitos");
        }
        this.cpf = cpf;
    }

    public static Cliente criar(String nome, String cpf) {
        return new Cliente(nome, cpf);
    }
}