# Desafio - Sistema Bancário com POO

Neste desafio, vamos simular um sistema bancário com diferentes tipos de conta, utilizando herança, polimorfismo e composição.

## 🎯 Objetivos
- Aplicar os principais pilares da Programação Orientada a Objetos
- Simular regras reais como taxa de saque e rendimento de poupança

## 🧱 Requisitos
### Classes obrigatórias
#### 1. `Cliente`
- Atributos privados:
  - `nome` (String)
  - `cpf` (String)
 
#### 2. `Conta`
- Atributos privados:
  - `titular` (Cliente)
  - `numero` (int)
  - `saldo` (double)
- Métodos públicos:
  - `depositar`(double valor)
  - `sacar`(double valor)
  - `verSaldo()`

#### 3. `ContaCorrente` (herda de Conta)
- Taxa de saque (ex: 0.5%)
- Método sacar() sobrescrito com lógica de taxa

#### 4. `ContaPoupanca` (herda de Conta)
- Rende juros (simular renderJuros() que adiciona 1% ao saldo)

#### 5. `Main`
- Criar um `Cliente`, uma `ContaCorrente` e uma `ClientePoupanca`.
- Realizar depósitos, saques, ver saldo, aplicar juros (na poupança)
