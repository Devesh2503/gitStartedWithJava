package com.Revision.OOPS;

public class Interfaces {

    public static void main(String[] args) {

        NotificationService service;

        service = new EmailNotificationService();
        service.sendNotification("Welcome User");

        service = new SMSNotificationService();
        service.sendNotification("OTP: 4567");
    }
}

interface NotificationService {

    void sendNotification(String message);
}

class EmailNotificationService
        implements NotificationService {

    @Override
    public void sendNotification(String message) {

        System.out.println(
                "Sending EMAIL: " + message
        );
    }
}


class SMSNotificationService
        implements NotificationService {

    @Override
    public void sendNotification(String message) {

        System.out.println(
                "Sending SMS: " + message
        );
    }
}

/*
If company says "Tomorrow add WhatsApp notification"
✅ Easy with Interface

Just create:
 */

class WhatsAppNotificationService
        implements NotificationService {

    @Override
    public void sendNotification(String message) {

        System.out.println(
                "Sending WhatsApp Message: " + message
        );
    }
}

/*
👉 Interface only defines:
WHAT must be done
NOT
HOW it is done

Any class implementing NotificationService MUST provide sendNotification

An interface in Java is a blueprint that defines a set of methods a class must implement
without providing full implementation details.
It helps achieve abstraction by focusing on what a class should do rather than how it does it.
 Interfaces also support multiple inheritance in Java.

A class must implement all abstract methods of an interface.
All variables in an interface are public, static, and final by default.
Interfaces can have default, static, and private methods (Java 8+ and 9+).
 */