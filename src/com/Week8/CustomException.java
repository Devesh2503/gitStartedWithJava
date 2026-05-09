package com.Week8;

public class CustomException {

}

class InsufficientBalanceExceptions
        extends Exception {

    public InsufficientBalanceExceptions(String message) {

        super(message);
    }
}


class BankAccount {

    double balance = 1000;

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if(amount > balance) {

            throw new InsufficientBalanceException(
                    "Balance too low"
            );

        }

        balance -= amount;

    }

}
