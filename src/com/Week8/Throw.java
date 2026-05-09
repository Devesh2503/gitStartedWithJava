package com.Week8;

public class Throw {
}

//Without throw

class Bank {

    void withdraw(int balance, int amount) {

        balance = balance - amount;

        System.out.println("Withdraw Successful");
    }
}
//Problem:
//User can withdraw more money than available.

// with Throw

class Banks {

    void withdraw(int balance, int amount) {

        if(amount > balance) {

            throw new RuntimeException(
                    "Insufficient Balance"
            );
        }

        balance = balance - amount;

        System.out.println("Withdraw Successful");
    }
}

/*
Exception in thread "main"
java.lang.RuntimeException: Insufficient Balance
 */

//custom  Exception

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message){
        super(message);
    }
}

/*
throw is a keyword used to explicitly throw an exception.
syntax: throw new ExceptionType("Message");
ex: throw new ArithmeticException("Number cannot be divided by zero");
 */