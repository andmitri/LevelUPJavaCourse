public class CastExamples {

    public static void main(String[] args) {

        int intValue = 15;
        double doubleValue = 535.43;

        long longValue = intValue;
        float floatValue;
        floatValue = (float) doubleValue;

        int result = (int)(intValue + longValue);

        byte b = (byte) 130;
        System.out.println(b);

    }
}
