package homework.homeworktwo;
//Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

public class NoNegativeSequence {
    public static void main(String[] args) {

        int digit;

        for (digit = 90; digit >= 0; digit = digit - 5) {
            System.out.println(digit);
        }

    }
}
