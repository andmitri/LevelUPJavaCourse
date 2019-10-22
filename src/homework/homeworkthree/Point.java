package homework.homeworkthree;

import java.util.Scanner;

public class Point {

    private int x;
    private int y;
    int quadrant;

    int quadrant() {
        if (this.x == 0 || this.y == 0) {
            return this.quadrant = 0;
        }
        if(this.x > 0 && this.y > 0) {
            return this.quadrant = 1;
        }
        if (this.x > 0 && this.y < 0) {
            return this.quadrant = 4;
        }
        if (this.x < 0 && this.y > 0) {
            return this.quadrant = 2;
        }
        if (this.x < 0 && this.y < 0) {
            return this.quadrant = 3;
        }
        return this.quadrant;

    }

    Point flip() {
        Point secondPoint = new Point();
        secondPoint.x = x*-1;
        secondPoint.y = y*-1;
        return secondPoint;
    }

    public static void main(String[] args) {
        Point myNewPoint = new Point();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        myNewPoint.x = scanner.nextInt();
        System.out.println("Enter y: ");
        myNewPoint.y = scanner.nextInt();

        System.out.println("Quadrant is: " + myNewPoint.quadrant());

        Point myFlippedPoint = myNewPoint.flip();

        System.out.println("Flipped points are: " + myFlippedPoint.x + ", " + myFlippedPoint.y);

       }

}
