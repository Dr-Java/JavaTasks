package com.drjava;
import java.util.*;

public class Calculator2 {

    public static void main(String[] args) {
        int add, sub, multi, div = 0;
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello from simple calculator!");
        System.out.println();

    System.out.print("Type first number here: ");
    x = scanner.nextInt();

    System.out.print("Type second number here: ");
    y = scanner.nextInt();

        add = x + y;
        sub = x - y;
        multi = x * y;

        try {
            div = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Note: Division by ZERO is a bad idea!!!");
        }


        System.out.print("Choose one operation (+, -, * or /): ");


        String s = scanner.next();
        switch (s) {
            case "+":
                System.out.println("Sum = " + add);
                break;
            case "-":
                System.out.println("Subtraction = " + sub);
                break;
            case "*":
                System.out.println("Multiplication = " + multi);
                break;
            case "/":
                System.out.println("Division = " + div);
                break;
            default:
                System.out.println("You can't use this operation:(");
                break;
        }

    }
}