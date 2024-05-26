public class EnhancedSwitchChallenge {

    public static void main(String[] args) {
        printDayOfWeek(5);
        printWeekDay(8);

    }

    public static void printDayOfWeek(int day) {
        String dayOfTheWeek = switch (day) {
            case 0 -> "SUNDAY";
            case 1 -> "MONDAY";
            case 2 -> "TUESDAY";
            case 3 -> "WEDNESDAY";
            case 4 -> "THURSDAY";
            case 5 -> "FRIDAY";
            case 6 -> "SATURDAY";
            default -> "Invalid Day";
        };
        System.out.println("Day " + day + " is " + dayOfTheWeek);
    }

    public static void printWeekDay(int day) {
        if (day == 0) {
            System.out.println("Day " + day + " is Sunday");
        } else if (day == 1) {
            System.out.println("Day " + day + " is Monday");
        } else if (day == 2) {
            System.out.println("Day " + day + " is TUESDAY");
        } else if (day == 3) {
            System.out.println("Day " + day + " is WEDNESDAY");
        } else if (day == 4) {
            System.out.println("Day " + day + " is THURSDAY");
        } else if (day == 5) {
            System.out.println("Day " + day + " is FRIDAY");
        } else if (day == 6) {
            System.out.println("Day " + day + " is SATURDAY");
        } else {
            System.out.println("Day " + day + " is Invalid Day");
        }
    }
}
