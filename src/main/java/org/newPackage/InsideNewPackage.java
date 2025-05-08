package org.newPackage;

import org.example.Calculator; // Visa
import org.example.NewClass;


public class InsideNewPackage {
    Calculator calc = new Calculator();

    public static void main(String[] args) {
        NewClass new12 = new NewClass();
        new12.newMethod12();
    }

}
