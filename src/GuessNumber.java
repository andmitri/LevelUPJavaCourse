import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value:");
        int number = sc.nextInt();

        Random randomizer = new Random();
        // nextInt() -> [0,32)
        //[-5, 6)
        int secretNumber = randomizer.nextInt(11) - 5;
       /* if(number == secretNumber){
            //5==5
            System.out.println("You are right!");
        } else {
            if (number > secretNumber) {
                System.out.println("Value is more than needed");
            } else {
                System.out.println("Value is less than needed");
            }
        }*/
       if(number == secretNumber){
            //5==5
            System.out.println("You are right!");
        } else if (number > secretNumber) {
                System.out.println("Value is more than needed");
            } else {
                System.out.println("Value is less than needed");
            }
        }
        }


