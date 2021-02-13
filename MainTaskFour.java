package com.drjava;

import java.util.Scanner;

public class MainTaskFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type first number: ");
        int firstInt = scanner.nextInt();
        System.out.print("Type second number: ");
        int secondInt = scanner.nextInt();

        int add = firstInt + secondInt;
        int mult = firstInt * secondInt;

            System.out.println("Addition result is " + add);
            System.out.println("Multiplication result is " + mult);
        }
    }

