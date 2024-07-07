import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date4_odd_even_dates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate date1 = LocalDate.parse(str1, dtf);
            LocalDate date2 = LocalDate.parse(str2, dtf);

            System.out.println("ALL EVEN DATES ARE :: >> ");
            LocalDate date3 = date1;
            while (date3.isBefore(date2) || date3.equals(date2)) {
                if (date3.getDayOfMonth() % 2 == 0) {
                    System.out.println(date3.format(dtf));
                }
                date3 = date3.plusDays(1);
            }

            System.out.println("ALL ODD DATES ARE ::>> ");
            LocalDate date4 = date1;
            while (date4.isBefore(date2) || date4.equals(date2)) {
                if (date4.getDayOfMonth() % 2 != 0) {
                    System.out.println(date4.format(dtf));
                }
                date4 = date4.plusDays(1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
