package com.Revision.OOPS;

public class Polymorphism {
    public static void main(String[] args) {
        Notification n;

        n = new EmailNotification();
        n.send();

        n = new SMSNotification();
        n.send();
    }
}


class Notification {

    public void send() {

        System.out.println(
                "Sending notification"
        );

    }

}

class EmailNotification
        extends Notification {

    @Override
    public void send() {

        System.out.println(
                "Sending Email"
        );

    }

}

class SMSNotification
        extends Notification {

    @Override
    public void send() {

        System.out.println(
                "Sending SMS"
        );

    }

}

/*
Polymorphism = one reference → multiple behaviors at runtime
Polymorphism means:
Same method name → Different behavior

Example: Notification System

Email
SMS
Push Notification


Types of Polymorphism (IMPORTANT)
✅ 1. Compile-time (Method Overloading)
void send() {}
void send(String msg) {}

👉 Decided at compile time

✅ 2. Runtime (Method Overriding) ← YOUR EXAMPLE
n = new EmailNotification();
n.send();

👉 Decided at runtime
 */


/*
public static void main(String[] args) {

    Notification[] notifications = {
        new EmailNotification(),
        new SMSNotification(),
        new PushNotification()
    };

    for (Notification n : notifications) {
        n.send();
    }
}
 */