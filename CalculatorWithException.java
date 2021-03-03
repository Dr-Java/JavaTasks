package com.drjava;
import java.util.Scanner;

public class CalculatorWithException {

    public static void main(String[] args) {
        System.out.println("Only addition, subtraction, multiplication" +
                "and division are available here!");
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int x = scan.nextInt();
        System.out.print("One more number: ");
        int y = scan.nextInt();

        System.out.println("x+y=" + (x + y));
        System.out.println("x-y=" + (x - y));
        System.out.println("x*y=" + x * y);
        try {
            System.out.println("x/y=" + x / y);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by 0 is a bad idea:(");
        }
        finally {
            System.out.println("Try again!");
        }
    }
}
