package com.drjava;

import  java.util.*;

public class Calculator {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println("Hello from simple calculator!");
        System.out.println();

        System.out.print("Type first number here: ");
	    int x = scanner.nextInt();

        System.out.print("Type second number here: ");
        int y = scanner.nextInt();

        int add = x + y;
        int sub = x - y;
        int multi = x * y;
        double div = y / x;

        System.out.print("Choose one operation (+, -, * or /): ");

        String s = scanner.next();
        if (s.equals("+")) {
            System.out.println("Sum = " + add);
        } else if (s.equals("-")) {
            System.out.println("Subtraction = " + sub);
        } else if (s.equals("*")) {
            System.out.println("Multiplication = " + multi);
        } else if (s.equals("/")) {
            System.out.println("Division = " + div);
        } else {
            System.out.println("You can't use this operation:(");
        }

    }
}
