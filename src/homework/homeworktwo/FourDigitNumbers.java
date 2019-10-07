package homework.homeworktwo;
//Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….

public class FourDigitNumbers {

    public static void main(String[] args) {

        int digit;

        for (digit = 1000; digit < 10000; digit = digit + 3) {
            System.out.println(digit);
        }
    }

}
