package homework.homeworktwo;
//Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();

        int factorial = 1;

        for (int n = 1; n <= number; n++){
            factorial = factorial * n;
        }

        System.out.println(factorial);

    }

}
