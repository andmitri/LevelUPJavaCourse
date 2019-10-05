package homework.homeworktwo;

//Создать программу, выводящую на экран ближайшее к 10 из двух положительных чисел, записанных в переменные m и n.
// Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.

import java.util.Scanner;

public class CloseToTen {
    public static void main(String[] args) {

        double i = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number:");
        double secondNumber = scanner.nextDouble();

        double a;
        a = 10 - firstNumber;
        double b;
        b = 10 - secondNumber;

        if (a > b){
            System.out.println("value " + firstNumber + " is close to 10");
        } else {
            System.out.println("value " + secondNumber + " is close to 10");
        }

    }
}
