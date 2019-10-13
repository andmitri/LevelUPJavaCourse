package lessonthree;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("Enter name");
        Scanner sc = new Scanner(System.in);
        String enteredName = sc.nextLine();

        System.out.println("Enter weight");
        double enteredWeight = sc.nextDouble();

        System.out.println("Enter count");
        int enteredCount = sc.nextInt();

        Product p1;
        p1 = new Product();

        p1.name = enteredName;
        p1.weight = enteredWeight;
        p1.count = enteredCount;

        System.out.println(p1.name + " " + p1.weight);
        System.out.println("Count is: " + p1.count);

        int newCount = p1.increaseAndGet(10);
        System.out.println("Amount after count is: " + newCount);


    }
}
