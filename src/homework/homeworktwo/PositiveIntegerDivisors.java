package homework.homeworktwo;

import java.util.Scanner;

//Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
public class PositiveIntegerDivisors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Number is incorrect - negative");
            return;
        }

        for (int n = 1; n<= number; n++) {
            int divisor;
            divisor = number % n;
            if (divisor == 0){
                System.out.println(n);
            }
        }

    }

}
