import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class SaravananP14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the month(1-12)");
        if (!sc.hasNextInt()) return;
        int month = sc.nextInt();
        System.out.println("Input date (1-31)");
        if (!sc.hasNextInt()) return;
        int day = sc.nextInt();
        
        try {
            LocalDate date = LocalDate.of(2004, month, day);
            String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
            System.out.println("Name of the date:");
            System.out.println(dayOfWeek);
        } catch (Exception e) {
            System.out.println("Invalid date for 2004.");
        }
    }
}
