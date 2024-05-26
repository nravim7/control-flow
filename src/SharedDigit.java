public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(22, 23));
        System.out.println(hasSharedDigit(22, 53));
        System.out.println(hasSharedDigit(93, 23));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        int number1FirstDigit = number1;
        int number1LastDigit = number1 % 10;
        int number2FirstDigit = number2;
        int number2LastDigit = number2 % 10;

        int iterationNumber = 0;
        while (iterationNumber <= 0) {
            number1FirstDigit = number1 / 10;
            number2FirstDigit = number2 / 10;

            iterationNumber++;
        }

        if(number1FirstDigit == number2FirstDigit || number1FirstDigit == number2LastDigit) {
            return true;
        }
        else if(number1LastDigit == number2FirstDigit || number1LastDigit == number2LastDigit) {
            return true;
        }

        return false;
    }
}
