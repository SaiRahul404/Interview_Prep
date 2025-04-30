package org.example;
import java.util.Scanner;

public class CountDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int number = sc.nextInt();
        int count = 0;

        while(number > 0) {
            number = number /10; // 123456/10 = 12345/10 = 1234/10 = 123/10 = 12/10 = 1/10 =0
            count++; //6
        }

        System.out.println("Number of digits: " + count);
        sc.close();
    }

    int num1 = 3982385;
    float num2 = 567.6f;

}
