package org.example.core;



import org.example.exception.ValidaException;

import java.math.BigDecimal;


public class SavingsAccount extends Account{

    private final double fees = 0.01;

    public SavingsAccount(Client client, String number) {
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
            throw new ValidaException("Saldo insuficiente.");
        }

        this.setBalance(valueWithDraw);
    }

    public void incomeInterest(double value)
    {
        BigDecimal depositAmountInterest = BigDecimal.valueOf(value);

        BigDecimal FEES = BigDecimal.valueOf(fees);
        var taxFee = depositAmountInterest.multiply(FEES);
        var addsIncome = depositAmountInterest.add(taxFee);

        this.setBalance(addsIncome);
    }
}
