package org.example;

public class MainAbstract {
    public static void main(String[] args) {
        Notification notification = new SMSNotification("+91-9876543210");
        notification.sendNotification();

        notification = new EmailNotification("user@example.com");
        notification.sendNotification();
    }

}

abstract class Notification {
    String receiver;

    Notification(String receiver) {
        this.receiver = receiver;
    }

    // Abstract method (must be implemented in subclasses)
    abstract void sendNotification();

    // Concrete method (already implemented)
    void showNotificationDetails() {
        System.out.println("Sending notification to " + receiver);
    }
}

class SMSNotification extends Notification {
    SMSNotification(String receiver) {
        super(receiver);
    }

    @Override
    void sendNotification() {
        showNotificationDetails();
        System.out.println("Sending SMS to " + receiver);
    }
}

class EmailNotification extends Notification {
    EmailNotification(String receiver) {
        super(receiver);
    }

    @Override
    void sendNotification() {
        showNotificationDetails();
        System.out.println("Sending Email to " + receiver);
    }
}
// Notification defines a common structure for all notifications.
//
//
//SMSNotification and EmailNotification provide their own implementations for sendNotification().
//
//
//It ensures all notifications follow a standard format while allowing flexibility

