package homework.homeworktwo;
//Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
public class TwentyElements {

    public static void main(String[] args) {

        int digit = 1;

        for (int i = 0; i < 20; i++) {
            digit = digit * 2;
            System.out.println(digit);
        }
    }

}
