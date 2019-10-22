package lessonfive.square;

public class SquareCalculator {

    public static void main(String[] args) {
        Shape shape = new Rectangle(10, 5);
        System.out.println("Square: " + shape.square());

        Drawable drawable = new Rectangle(15, 47);
        drawable.draw();
    }

}
