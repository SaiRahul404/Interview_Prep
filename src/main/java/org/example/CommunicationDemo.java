package org.example;

public class CommunicationDemo {
    public static void main(String[] args) {
        CommunicationDevice communicationDevice = new CommunicationDevice();
        Phone phone = new Phone();
        Radio radio = new Radio();

        CommunicationDevice ref; // // Reference of type CommunicationDevice
        ref = communicationDevice; // communicationDevice object
        ref.communicate();

        ref = phone;
        ref.communicate();

        ref = radio;
        ref.communicate();
    }
}

class CommunicationDevice {
    void communicate() {
        System.out.println("Communicating in a generic way.");
    }
}

class Phone extends CommunicationDevice {
    @Override
    void communicate() {
        System.out.println("Talking over the phone.");
    }
}

class Radio extends CommunicationDevice {
    @Override
    void communicate() {
        System.out.println("Broadcasting via radio.");
    }
}
// Phone and Radio extend the base class and override the communicate() method.

// At runtime, Java determines which version of communicate() to call — this is dynamic method dispatch.