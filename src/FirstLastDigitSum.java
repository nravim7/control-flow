public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(525));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = number;
        int lastDigit = number % 10;

        if (number < 0) {
            return -1;
        }

        while(number > 9) {
            number = number / 10;
            firstDigit = number;

        }

        return (firstDigit + lastDigit);
    }
}
