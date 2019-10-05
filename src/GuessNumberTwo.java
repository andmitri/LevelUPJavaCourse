import java.util.Random;
import java.util.Scanner;

public class GuessNumberTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random randomizer = new Random();
        // nextInt() -> [0,32)
        //[-5, 6)
        int secretNumber = randomizer.nextInt(11) - 5;

        int number = 0;
        int tryCount = 3;


        do {
            System.out.println("you have " + tryCount + "attempt(s)");
            System.out.println("enter value");
            number = sc.nextInt();
            if (number > secretNumber) {
                System.out.println("you entered more");
            } else if (number < secretNumber){
                System.out.println("you entered less");
            }

            tryCount--;
        } while (number != secretNumber && tryCount != 0);

        if (number == secretNumber) {
            System.out.println("you are right");
        }else{
            System.out.println("you are wrong, no more attempts");
            System.out.println("secret number is" + secretNumber);
        }
    }
}

//while (a > b) {
//a = a - b;
      //  }
