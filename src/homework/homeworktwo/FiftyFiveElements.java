package homework.homeworktwo;

//Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …

public class FiftyFiveElements {

    public static void main(String[] args) {

        int digit = -1;

        for (int i = 0; i < 55; i++) {
            digit = digit + 2;
            System.out.println(digit);
        }
    }
}
