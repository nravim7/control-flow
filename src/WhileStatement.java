public class WhileStatement {

    public static void main(String[] args) {

        int number = 0;
        int number1 = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }

        do {
            number1 += 5;
            if (number1 % 25 == 0) {
                continue;
            }
            System.out.print(number1 + "_");

        } while (number1 < 50);
    }
}
