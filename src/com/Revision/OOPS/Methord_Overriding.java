package com.Revision.OOPS;

public class Methord_Overriding {
    public static void main(String[] args) {

        UpiPayment upi = new UpiPayment();
        upi.pay();

        CreditCardPayment card = new CreditCardPayment();
        card.pay();

        NetBankingPayment net = new NetBankingPayment();
        net.pay();
    }
}

class Payment {
    public void pay() {
        System.out.println("Processing payment");
    }
}

class UpiPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Processing UPI Payment");
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Processing Credit Card Payment");
    }
}

class NetBankingPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Processing Net Banking Payment");
    }
}
/*
METHOD OVERRIDING
Overriding means:
Child class changes parent behavior

for example
Payment System
Company supports:
UPI
Credit Card
Net Banking
 here all are payment methord.
 */