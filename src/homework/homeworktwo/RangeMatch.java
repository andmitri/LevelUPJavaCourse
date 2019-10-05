package homework.homeworktwo;

//Создать программу, которая будет проверять попало ли случайно выбранное
// из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран.
// Примеры работы программы:Число 113 не содержится в интервале (25,100).
// Число 72 содержится в интервале (25,100). Число 25 не содержится в интервале (25,100)
// Число 155 не содержится в интервале (25,100)


import java.util.Random;

public class RangeMatch {

    public static void main(String[] args) {

        Random randomizer = new Random();
        int number = randomizer.nextInt(150) + 5;


    if((number>25) && (number<100)){
        System.out.println(number + " is in the range");
        } else {
        System.out.println(number + " is not in the range");
    }
    }
}
