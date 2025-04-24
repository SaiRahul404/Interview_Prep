package org.example;

public class ArthimeticOperators {
    public static void main(String[] args) {

        int salary_1 = 5000;
        int Salary = 6000;
        // Java treats uppercase and lowercase letters as different
        //  Variable Names Are Case-Sensitive
        // You can use:
        //✅ Letters (a-z, A-Z)
        //✅ Numbers (0-9)
        //✅ Underscore (_)
        //✅ Dollar sign ($)

        // ❌ The variable name cannot start with a number
        //❌ Spaces are not allowed
        //❌ You cannot use special symbols like @, #, %, &

        //  myAge = 25; (Uses only letters)
        //✅ salary_2024 = 50000; (Uses numbers and underscore)
        //✅ $balance = 1000; (Uses a dollar sign)
        // ❌ 2days = 7; (Starts with a number ❌)
        //❌ my salary = 5000; (Has a space ❌)
        //❌ @price = 300; (Uses a special character ❌)

        // class
        //public
        //static
        //int
        //boolean

        //int class = 5;
        int classNumber = 5;  // ✅ Correct!
        int studentAge = 10;
        int fullName = 6;
        int student_age = 20;

        int a = 10, b = 5;
        System.out.println(a + b); // 15
        System.out.println(a - b); // 5
        System.out.println(a * b); // 50
        System.out.println(a / b); // 2
        System.out.println(a % b); // 0

        int x = 10, y = 20;
        System.out.println(x > y);  // false
        System.out.println(x < y);  // true
        System.out.println(x == y); // false
        System.out.println(x != y); // true

        boolean a1 = true, b1 = false;
        System.out.println(a1 && b1); // false
        System.out.println(a1 || b1); // true
        System.out.println(!a1);     // false

        int m = 10;
        m += 5;
        m *= 2;
        System.out.println(m); // 30
    }
}
