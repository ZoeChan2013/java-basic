package debugging;

public class Debugging {
    public static void main(String[] args) {
        // declare variables
        int number;
        double average, value;
        String[] daysOfTheWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        // sample errors
        value = 3.75;
        number = (int)value;
        // average = (3 + 5 + 8) / 0; 
        System.out.println("The first day of the week is: " + daysOfTheWeek[0]);
        System.out.println("The last day of the week is: " + daysOfTheWeek[6]);
        average = (3 + 5 + 8) / 3.0;
        System.out.println("expected value is 5.33, actual value is: " + average);
    }
}