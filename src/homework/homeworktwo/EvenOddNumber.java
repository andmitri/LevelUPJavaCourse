package homework.homeworktwo;

//Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n, чётным либо нечётным.

import java.util.Scanner;

public class EvenOddNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value:");
        int number = scanner.nextInt();

        int i;
        i = number / 2;
        int b;
        b = i * 2;
        int c;
        c = number - b;

        if (c == 0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

    }
}
