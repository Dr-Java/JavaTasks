package com.drjava;
import java.util.*;

public class BodyMassIndex {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите Ваш вес (в кг): ");
	double weight = scanner.nextDouble();
        System.out.print("Укажите Ваш рост (в метрах, например, для роста 175см - 1,75): ");
	double height = scanner.nextDouble();

	double bmi = weight / (height * height);

        System.out.println("Ваш индекс массы тела: " + bmi);

        if (bmi<=16){
            System.out.println("Выраженный дефицит массы тела");
        } else if (bmi>16 && bmi<=18.5) {
            System.out.println("Недостаточная масса тела (дефицит)");
        } else if (bmi>18.5 && bmi<=24) {
            System.out.println("Нормальная масса тела");
        } else if (bmi>24 && bmi<=30) {
            System.out.println("Избыточная масса тела (предожирение)");
        } else if (bmi>30 && bmi<=35) {
            System.out.println("Ожирение I степени");
        } else if (bmi>35 && bmi<=40) {
            System.out.println("Ожирение II степени");
        } else if (bmi>=40) {
            System.out.println("Ожирение III степени");
        } else {
            System.out.println();
        }
    }
}
