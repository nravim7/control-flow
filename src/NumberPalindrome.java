public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));

    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int originalNumber = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number = number / 10;
        }

        if (originalNumber == reverse) {
            return true;
        }
        return false;
    }
}
