package homework.homeworktwo;

//В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
// Создать программу, которая переставит числа в переменных таким образом,
// чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.

public class IncreasingNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        int c = -22;

        int biggest;
        if (a > b) {
            biggest = a;
        } else {
            biggest = b;
        }

        if (biggest < c) {
            biggest = c;
        }

        int smallest;
        if (a < b) {
            smallest = a;
        } else {
            smallest = b;
        }

        if (smallest > c) {
            smallest = c;
        }

        int middle = a;

        if (a != biggest && a != smallest) {
            middle = a;
        }

        if (b != biggest && b != smallest) {
            middle = b;
        }

        if (c != biggest && c != smallest) {
            middle = c;
        }

        System.out.println(smallest + " " + middle + " " + biggest);


    }


}
