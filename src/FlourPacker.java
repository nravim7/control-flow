public class FlourPacker {
    public static void main(String[] args) {
//        System.out.println(canPack(1, 0, 4));
//        System.out.println(canPack (1, 0, 5));
//        System.out.println(canPack (0, 5, 4));
//        System.out.println(canPack (2, 2, 11));
//        System.out.println(canPack (-3, 2, 12));

        System.out.println(canPack(5, 3, 24));
    }

//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//
//        if(bigCount < 0 || smallCount < 0) {
//            return false;
//        }
//
//        int bigCountInKilos = 5 * bigCount;
//        int smallCountInKilos = smallCount;
//
//        if(bigCountInKilos > goal && smallCountInKilos == 0) {
//            return false;
//        }
//        else if ((bigCountInKilos + smallCountInKilos) >= goal) {
//            return true;
//        }
//
//        return false;
//    }


    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigCount * 5;
        if (totalBigWeight >= goal) {
            int remaining = goal % 5;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }
}
