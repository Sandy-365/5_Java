import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        // String str2 = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse(str1, dtf);
        // LocalDate date2 = LocalDate.parse(str2, dtf);

        // Long date = ChronoUnit.DAYS.between(date1, date2);
        LocalDate date = date1.plus(150, ChronoUnit.DAYS);
        System.out.println(date);
    }
}
