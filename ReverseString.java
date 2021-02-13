package com.drjava;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type something here: ");
        StringBuffer stringBuffer = new StringBuffer(scanner.nextLine());
        stringBuffer.reverse();
        System.out.println(stringBuffer.toString());
        }
    }

