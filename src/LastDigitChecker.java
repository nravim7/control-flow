public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if(!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        }

        int n1LD = number1 % 10;
        int n2LD = number2 % 10;
        int n3LD = number3 % 10;

        if(n1LD == n2LD || n1LD == n3LD || n2LD == n3LD) {
            return true;
        }

        return false;
    }
}
