public class PrimeNumberChallenge {

    public static void main(String[] args) {
//        System.out.println("0 is " + (isPrime(0)? "" : "NOT ") + "a prime number");
//        System.out.println("1 is " + (isPrime(1)? "" : "NOT ") + "a prime number");
//        System.out.println("2 is " + (isPrime(2)? "" : "NOT ") + "a prime number");
//        System.out.println("3 is " + (isPrime(3)? "" : "NOT ") + "a prime number");
        int count = 0;
//        for (int number = 10; number <= 50; number++) {
//            System.out.println(number + " is " + (isPrime(number)? "" : "NOT ") + "a prime number");
//            if (isPrime(number)) {
//                counter++;
//                System.out.println("Prime number count = " + counter);
//                if (counter == 3) {
//                    break;
//                }
//            }
//        }

        for (int i = 10; count < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
