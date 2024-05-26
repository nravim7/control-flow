public class Sum3And5Challenge {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int loopNumber = 1; count < 5 && loopNumber <= 1000; loopNumber++) {
            if (loopNumber % 3 == 0 && loopNumber % 5 == 0) {
                System.out.println("Found a match = " + loopNumber);
                sum += loopNumber;
                count++;
            }
        }
        System.out.println("Sum of the first 5 numbers that met the condition = " + sum);

        for (int i = 100; i > 0; i -= 10) {
            System.out.println("should not execute " + i);
        }
    }
}
