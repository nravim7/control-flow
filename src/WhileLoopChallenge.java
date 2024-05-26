public class WhileLoopChallenge {
    public static void main(String[] args) {

        int number = 4;
        int countOdd = 0;
        int countEven = 0;
        while (number <= 20 && countEven < 5) {
            number++;                                                       //incrementing number in the start of loop to avoid infinite loop

//            if (!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println(number + " is an Even number");
            if (isEvenNumber(number)) {
                System.out.println(number + " is an Even number");
                countEven++;

            } else {
                countOdd++;
            }

        }

        System.out.println("Total even numbers = " + countEven + " and odd numbers = " + countOdd);

    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

}
