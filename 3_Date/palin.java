import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class palin {
    public static void palindrome(LocalDate start, LocalDate end) {
        LocalDate temp = start;
        while (temp.isBefore(end) || temp.equals(end)) {
            String str1 = temp.format(DateTimeFormatter.ofPattern("ddMMyyyy"));
            String str2 = (new StringBuilder(str1)).reverse().toString();
            if (str1.equals(str2)) {
                System.out.println(temp.format(DateTimeFormatter.ofPattern("dd-MM-syyyy")));
            }
            temp = temp.plusDays(1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date1 = LocalDate.parse(str1, dtf);
        LocalDate date2 = LocalDate.parse(str2, dtf);

        palindrome(date1, date2);

    }
}
