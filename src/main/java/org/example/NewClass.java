package org.example;

public class NewClass {

    String newField;

    public String newField12;

    private void newMethod() {
        System.out.print("New Method");
    }

    public void newMethod12() {
        System.out.print("New Method 12");
    }

}

class NewClass12 {
    public static void main(String[] args) {
        NewClass new1 = new NewClass();
        new1.newMethod12();
        String newField12 = new1.newField12;
        String newField = new1.newField;
    }
}



