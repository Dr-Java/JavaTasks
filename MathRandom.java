package com.drjava;

public class MathRandom {

    public static void main(String[] args) {
        int from = 0;
        int to = 666;
        for (int i = 0; i < 15; i++) {
            int random = from + (int) (Math.random() * to);

            System.out.print(" " + random);
        }
            for (int j = 0; j < 15; j++) {
                int random = from + (int) (Math.random() * to);

            System.out.println(" " + random);
        }
    }
}
