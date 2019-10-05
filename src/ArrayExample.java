public class ArrayExample {

    public static void main(String[] args) {
        int[] integers = new int[7];
        integers[0] = 535;
        integers[2] = 865;
        integers[4] = 54;
        //index = offset

        int value = integers[4];
        System.out.println("5 value from array: " + value);
        System.out.println("array length " + integers.length);

        for (int index = 0; index < integers.length; index++){
            System.out.println(integers[index]);
        }
    }
}
