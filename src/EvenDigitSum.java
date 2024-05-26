public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1234));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(123456789));

    }

    public static int getEvenDigitSum(int number) {
        int evenSum = 0;

        if (number < 0) {
            return -1;
        }

        while (number > 0) {
            int lastNumber = number % 10;
            if (lastNumber % 2 == 0) {
                evenSum += lastNumber;
            }

            number /= 10;
        }

        return evenSum;
    }
}
