package org.example;

public class TrainBooking {
    public void bookTicket(String name) {
        System.out.println(name + " booked a ticket.");
    }

    public void bookTicket(String name, String seatType) {
        System.out.println(name + " booked a " + seatType + " seat.");
    }
    void bookTicket(String name, String seatType, String meal) {
        System.out.println(name + " booked a " + seatType + " seat with " + meal + " meal.");
    }
}

class TrainBookingExample {
    public static void main(String[] args) {
        TrainBooking obj = new TrainBooking();
        obj.bookTicket("Rahul");
        obj.bookTicket("Rahul", "Lower");
        obj.bookTicket("Rahul", "Upper", "Veg");
    }
    // The same method name is used for different cases.
    //Java automatically picks the right version based on parameters.

    // Same method name but different parameters.
    //✔ Parameters must differ in number or type.
    //✔ Return type does NOT matter.
}
