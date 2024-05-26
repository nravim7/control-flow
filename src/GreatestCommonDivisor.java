public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int upToNumber = 0;
        if (first < second) {
            upToNumber = first;
        }
        else if(second < first) {
            upToNumber = second;
        }
        int gcd = 0;

        for(int i = 1; i <= upToNumber; i++) {
            if(first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
}
