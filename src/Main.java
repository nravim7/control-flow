public class Main {
    public static void main(String[] args) {
        int switchValue = 2;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3 -> System.out.println("Value was 3");
            default -> System.out.println("Was not 1, 2 or 3");
        }

        System.out.println(getQuarter("January"));
        System.out.println(getQuarter("October"));
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> "First Quarter";
            case "April", "May", "June" -> "Second Quarter";
            case "July", "August", "September" -> "Third Quarter";
            case "October", "November", "December" -> "Fourth Quarter";
            default -> "Invalid month";
        };
    }
}
