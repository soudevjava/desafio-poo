package org.example.core;



import org.example.exception.ValidaException;

import java.math.BigDecimal;

public class CurrentAccount extends Account{

    private final double withDrawalFee = 0.005;

    public CurrentAccount(Client client, String number) {
        super(client, number);
    }

    @Override
    public void deposit(double value) {
        this.setBalance(getBalance().add(BigDecimal.valueOf(value)));
    }

    @Override
    public void withdraw(double value)
    {
        BigDecimal valueWithDraw = BigDecimal.valueOf(value);

        if (valueWithDraw.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ValidaException("O valor do saque deve ser maior que zero.");
        }

        if (getBalance().compareTo(valueWithDraw) < 0) {
            throw new ValidaException(" Saldo insuficiente.");
        }

        var taxDraw = BigDecimal.valueOf(withDrawalFee);
        var valueTax = valueWithDraw.multiply(taxDraw);
        var totalResult = valueWithDraw.subtract(valueTax);

        this.setBalance(totalResult);
    }
}
