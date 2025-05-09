package org.example;

public class UseSuper {
    public static void main(String args[]) {
        B1 subOb = new B1(1, 2);
        subOb.show();
        Child1 child1 = new Child1(2,3);
        child1.show();
    }

}

class A1 {
    int i;
}

class B1 extends A1 {
    int i; // / this i hides the i in A1

    B1(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);

    }
}
// This second form of super is most applicable to situations in which member names of a subclass hide members by the same name in the superclass.
// The second form of super acts somewhat like "this", except that it always refers to the superclass of the subclass in which it is used.

class Parent1 {

    int value;
    Parent1() {
        System.out.println("Inside Parent1 default");
    }

    Parent1(int x) {
        this.value = x;
        System.out.println("Inside Parent1 Parameterized");
    }
}

class Child1 extends Parent1 {

    int value;
    Child1(int x, int y) {
        super(x); // Must be first statement
        this.value = y;
        // other initialization
    }
    void show() {
        System.out.println(super.value); // 10 (parent's)
        System.out.println(value);      // 20 (child's)
    }
}