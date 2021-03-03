package com.drjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write your name here: ");
        System.out.println("Hello, " + scanner.nextLine() + "!");
    }
}
