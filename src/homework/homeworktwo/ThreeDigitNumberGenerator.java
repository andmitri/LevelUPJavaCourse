package homework.homeworktwo;

//Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
//Примеры работы программы: В числе 208 наибольшая цифра 8. В числе 774 наибольшая цифра 7. В числе 613 наибольшая цифра 6


import java.util.Random;

public class ThreeDigitNumberGenerator {
    public static void main(String[] args) {
        Random randomizer = new Random();
        int threeDigitNumber = randomizer.nextInt(899) + 100;
        System.out.println("Generated number is " + threeDigitNumber);

        int firstDigit = threeDigitNumber % 1000 / 100;
        int secondDigit = threeDigitNumber % 100 / 10;
        int thirdDigit = threeDigitNumber % 10;

        int biggest;
        if (firstDigit > secondDigit) {
            biggest = firstDigit;
        } else {
            biggest = secondDigit;
        }

        if (biggest < thirdDigit) {
            biggest = thirdDigit;
        }
        System.out.println("Biggest digit is: " + biggest);

    }
}
