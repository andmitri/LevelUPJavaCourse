package homework.homeworkthree;

import java.util.Scanner;

public class CalcInit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter int a:");
        int a = scanner.nextInt();

        System.out.println("Enter int b:");
        int b = scanner.nextInt();

        System.out.println("Result is " + Calculator.sum(a,b));

        System.out.println("Enter double c:");
        double c = scanner.nextDouble();

        System.out.println("Enter double d:");
        double d = scanner.nextDouble();

        System.out.println("Result is " + Calculator.sum(c,d));

        System.out.println("Enter double f:");
        double f = scanner.nextDouble();

        System.out.println("Enter double e:");
        double e = scanner.nextDouble();

        System.out.println("Result is " + Calculator.sum(f,e));

        System.out.println("Enter double g:");
        long g = scanner.nextLong();

        System.out.println("Enter double h:");
        double h = scanner.nextLong();

        System.out.println("Result is " + Calculator.sum(g,h));

    }
}
