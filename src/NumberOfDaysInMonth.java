public class NumberOfDaysInMonth {
    public static void main(String[] args) {
//        int days = getDaysInMonth(2, 2000);
//        System.out.println("This month has " + days + " Days");
//
//        int days2 = getDaysInMonth(1, 2000);
//        System.out.println("This month has " + days2 + " Days");
//
//        int days3 = getDaysInMonth(2, 2018);
//        System.out.println("This month has " + days3 + " Days");
//
//        int days4 = getDaysInMonth(-1, 2020);
//        System.out.println("This month has " + days4 + " Days");
//
//        int days5 = getDaysInMonth(1, -2020);
//        System.out.println("This month has " + days5 + " Days");

//        int days6 = getDaysInMonth(8, -1024);
//        System.out.println("This month has " + days6 + " Days");
        System.out.println(isLeapYear(-1024));
    }

    public static boolean isLeapYear(int year) {
        boolean booleanValue = false;
        if (year < 1 || year > 9999) {
            booleanValue = false;
        }
        else if(year % 4 == 0 && year % 100 != 0) {
            booleanValue = true;
        }
        else if(year % 100 == 0 && year % 400 == 0) {
            booleanValue = true;
        }
        return booleanValue;
    }

    public static int getDaysInMonth(int month, int year) {
        int daysInMonth = 0;
        if(month < 1 || month > 12 || year < 1 || year > 9999) {
            daysInMonth = -1;
        }

        else if(isLeapYear(year)) {
            daysInMonth = switch(month) {
                case 2 -> 29;
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                default -> 0;
            };
        }
        else if(!isLeapYear(year)) {
            daysInMonth = switch(month) {
                case 2 -> 28;
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                default -> 0;
            };
        }
        return daysInMonth;

    }
}
