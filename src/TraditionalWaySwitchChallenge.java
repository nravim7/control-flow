public class TraditionalWaySwitchChallenge {
    public static void main(String[] args) {

        //System.out.println(natoAlphabet('C'));

        char charValue = 'X';
        switch (charValue) {
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println("Letter " + charValue + " was not found in the switch");
                break;
        }
    }

//    public static String natoAlphabet(char letter) {
//        return switch (letter) {
//            case 'A':
//                yield "CAR";
//            case 'B':
//                yield "BAKER";
//            case 'C':
//                yield "CHARLIE";
//            case 'D':
//                yield "DOG";
//            case 'E':
//                yield "EASY";
//            default:
//                yield "Not found";
//        };
//    }
}
