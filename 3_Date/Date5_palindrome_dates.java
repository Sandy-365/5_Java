import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date5_palindrome_dates {
    public void palindrome(LocalDate start, LocalDate end) {
        LocalDate start1 = start;
        LocalDate end1 = end;
        while (start1.isBefore(end1) || start1.equals(end1)) {

            String str = start1.toString();

            str = str.replace("-", "");
            String str1 = "";
            StringBuilder str2 = new StringBuilder(str);
            str2.reverse();
            str1 = str2.toString();
            System.out.println(str + "    " + str1);

            if (str.equals(str1)) {
                System.out.println("Palindrome dates ::>>" + start1);
                // break;
            }
            start1 = start1.plusDays(1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date1 = LocalDate.parse(str1, dtf);
        LocalDate date2 = LocalDate.parse(str2, dtf);

        Date5_palindrome_dates obj = new Date5_palindrome_dates();
        obj.palindrome(date1, date2);
    }
}
