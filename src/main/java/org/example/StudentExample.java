package org.example;

public class StudentExample {
    public static void main(String[] args) {
        StudentNew student1 = new StudentNew("John", 20);

        // Accessing private data using methods
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Age: " + student1.getAge());

        // Trying to change data safely
        student1.setName("David");
        student1.setAge(22);

        System.out.println("Updated Student Name: " + student1.getName());
        System.out.println("Updated Student Age: " + student1.getAge());
    }
}

class StudentNew {
    private String name;  // Private variable (cannot be accessed directly)
    private int age;

    // Constructor
    public StudentNew(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String newName) {
        this.name = newName;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int newAge) {
        if (newAge > 0) {
            this.age = newAge;
        } else {
            System.out.println("Invalid age!");
        }
    }
}
// name and age are private and cannot be accessed directly.
//We use getter methods (getName(), getAge()) to retrieve data.
//We use setter methods (setName(), setAge()) to modify data safely.

// Private variables restrict direct access.
//✅ Getter and Setter methods allow controlled access.
//✅ Only necessary details are exposed to the outside world.

//  Car Engine:
//You cannot directly control engine components.
//You use startCar() and stopCar() methods instead.

// Your phone’s internal storage is private.
//You access it via addFile() or deleteFile() methods.

// ATM Machine:
//Your account balance is private.
//You use withdrawMoney() or checkBalance() methods instead.

// Encapsulation is like a protective shield for data in Java. It ensures security, data integrity, and controlled access. By using private variables and public getter/setter methods, we make our code safe, flexible, and maintainable.

class GetterAndSetterExample {
    public double balance;
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.print("Invalid Amount");
        }
    }
}