package org.example;

public class StaticVariableExample {
    public static void main(String[] args) {
        StudentStatic s1 = new StudentStatic("John", 101);
        StudentStatic s2 = new StudentStatic("Alice", 102);
        StudentStatic.schoolName = "XYZ School";

        s1.display();
        s2.display();
        System.out.print(StudentStatic.schoolName);
    }
}
class StudentStatic {
    String name;  // Instance variable (Each student has a different name)
    int rollNo;   // Instance variable (Each student has a different roll number)
    static String schoolName = "ABC High School";  // Static variable (Same for all students)
    static String colorCode = "Red";

    StudentStatic(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println(rollNo + " - " + name + " - " + schoolName);
    }
}
// They are shared among all objects of the class.

// Static variables are useful when a value should be the same for all objects.
//They help save memory and avoid unnecessary repetition
