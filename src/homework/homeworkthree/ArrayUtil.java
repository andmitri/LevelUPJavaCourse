package homework.homeworkthree;

//Написать класс ArrayUtil. У него два метода - min(int[] array) и max(int[] array).
// Он должен возвращать вам минимум и максимум из переданного массива.
// Т.е. в метод min вы передаете массив, а в ответ вам возвращается число, которое является минимум из переданного массива.

public class ArrayUtil {



    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int minIndex(int[] array) {

        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;

    }

    public static int max(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int maxIndex(int array[]) {
        int max = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
