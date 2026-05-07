package com.Revision.OOPS;

public class Abstraction {
    public static void main(String[] args) {

        Payments p =  new CreditCardPayments();

        p.pay();
    }
}

abstract class Payments {

    abstract void pay();

}


class CreditCardPayments
        extends Payments {

    @Override
    void pay() {

        System.out.println(
                "Paying via Credit Card"
        );

    }

}
/*
Abstraction means:

Hide internal details
Show only essential features

Ex: ATM Machine

User sees:

Withdraw
Deposit
Check Balance

👉 Abstract class
👉 Cannot create direct object(Payments p = new Payments(); this is invalid)

👉 Abstract method
👉 No body/implementation

Meaning:

Every payment system MUST implement pay()
 */


/*
🔥 Important Rules of Abstract Class
✅ Rule 1: Cannot create object  [Payments p = new Payments();❌ Invalid:]
✅ Rule 2: Can have abstract + normal methods
✅ Rule 3: Child MUST implement abstract methods
✅ Rule 4: Abstract class can have constructor
✅ Rule 5: Abstract class can have variables
 */

/*
🔥 Abstract Method Rules
❌ Cannot have body
abstract void pay() {
} // ❌ invalid

✅ Must be overridden
 */