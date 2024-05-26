public class DigitSumChallenge {
    public static void main(String[] args) {

        System.out.println("Sum of Digits of given number = " + sumDigits(1200));
        System.out.println("Sum of Digits of given number = " + sumDigits(1255155));
        System.out.println("Sum of Digits of given number = " + sumDigits(1200));
        System.out.println("Sum of Digits of given number = " + sumDigits(-1255155));
        System.out.println("Sum of Digits of given number = " + sumDigits(1200));
        System.out.println("Sum of Digits of given number = " + sumDigits(8));

    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 9) {
            sum += number % 10;
            number /= 10;
        }

        sum += number;

//        for (int i = number; i > 0; i /= 10) {
//            sum += i % 10;
//        }
        return sum;

    }
}
