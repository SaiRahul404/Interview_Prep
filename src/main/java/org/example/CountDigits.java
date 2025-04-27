package org.example;

public class CountDigits {
    public static void main(String args[]) {
        int number = 38752593;
        int count = 0;

        while(number > 0) {
            number = number /10; // 123456/10 = 12345/10 = 1234/10 = 123/10 = 12/10 = 1/10 =0
            count++; //6
        }

        System.out.println("Number of digits: " + count);
    }

    int num1 = 3982385;
    float num2 = 567.6f;

}
