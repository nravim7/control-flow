public class ForLoop {
    public static void main(String[] args) {

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000, rate);
            System.out.println("10,000 at " + rate + "% rate = " + interestAmount);
        }

        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interestAmount = calculateInterest(100, rate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("$100 at " + rate + "% rate = $" + interestAmount);
        }

    }

    public static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100));
    }
}
