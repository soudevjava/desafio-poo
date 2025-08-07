package org.example.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public abstract class Account {

    private Client client;
    private String number;
    private BigDecimal balance = BigDecimal.ZERO;

    public Account(Client client, String number)
    {
        this.client = client;
        this.number = number;
    }
    public abstract void deposit(double value);

    public abstract void withdraw(double value);

    public BigDecimal viewBalance()
    {
        return balance;
    }
}
