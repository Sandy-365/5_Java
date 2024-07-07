import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date2_add_days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse(str1, dtf);

        LocalDate date = date1.plus(150, ChronoUnit.DAYS);
        System.out.println("After adding 150 days ::>> " + date.format(dtf));
    }

}
