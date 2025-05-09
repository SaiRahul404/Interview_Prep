package org.example;

public class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    A() {
        super();
        System.out.println("Inside A's constructor.");
    }

    A(int x, int y) {
        System.out.println("Inside A's paramterized constructor.");
    }
}
class B extends A {
    B() {
        super(10,30);
        System.out.println("Inside B's constructor.");
    }

    B(int x, int y) {
        System.out.println("Inside B's paramterized constructor.");
    }

}
class C extends B {
    C() {
        super(4,4);
        System.out.println("Inside C's constructor.");
    }
}
// In a class hierarchy constructors are called in order of derivation, from superclass to subclass.
// super(…) must be the first statement executed in a subclass’ constructor.
//If super(…) is not used, the default constructor of each superclass will be executed

// super keyword is used to call parent's class constructor.