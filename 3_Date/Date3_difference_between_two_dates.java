import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date3_difference_between_two_dates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate date1 = LocalDate.parse(str1, dtf);
            LocalDate date2 = LocalDate.parse(str2, dtf);

            Period date = Period.between(date1, date2);
            String s = String.format("%d Days %d Months %d Years", date.getDays(), date.getMonths(), date.getYears());
            System.out.println(s);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
