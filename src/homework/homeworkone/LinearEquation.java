package homework.homeworkone;

import java.util.Scanner;

public class LinearEquation {

    //Написать программу осуществляющую решение линейного уравнения ax + b = 0.
    // a и b задаете в программе, х выводите на экран.
    //x = -b/a

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ax + b = 0, x = ?");

        System.out.println("Enter a:");
        double a = scanner.nextInt();

        System.out.println("Enter b:");
        double b = scanner.nextInt();

        double x = -b / a;

        System.out.println("x = " + x);

    }
}
