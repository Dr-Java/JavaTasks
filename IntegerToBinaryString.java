package com.drjava;


import java.util.Scanner;

public class IntegerToBinaryString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           System.out.println("Type a number: ");
           String s = scanner.next();

        String a = Integer.toBinaryString(Integer.parseInt(s));
        System.out.println("Binary " + s + " is " + a);
    }
}
