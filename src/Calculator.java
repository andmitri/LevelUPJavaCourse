import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first int:");
        int firstVar = sc.nextInt();
        System.out.println("Enter second int:");
        int secondVar = sc.nextInt();

        int result = firstVar / secondVar;
        System.out.println("Result = " + result);
    }
}
