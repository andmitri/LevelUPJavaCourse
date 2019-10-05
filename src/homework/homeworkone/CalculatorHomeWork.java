package homework.homeworkone;

import java.util.Scanner;

public class CalculatorHomeWork {
    //Написать программу, которая производит математические операции на двумя переменными a и b и вывести результаты на экран.
    // Т.е. должны быть выведены сумма, разность, проиведение и частное.
    /// Попробуйте с разными типами a и b. Есть ли среди результатов отличия?

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int resultInt;

        resultInt = a + b;

        System.out.println("Sum of a and b is:" + resultInt);

        resultInt = b - a;

        System.out.println("Difference of a and b is:" + resultInt);

        resultInt = a * b;

        System.out.println("Multiplication of a and b is:" + resultInt);

        resultInt = b / a;

        System.out.println("Division of a and b is:" + resultInt);

        float c = 3.3f;
        float d = 4.4f;
        float resultFloat;

        resultFloat = c + d;

        System.out.println("Sum of c and d is:" + resultFloat);



    }
}
