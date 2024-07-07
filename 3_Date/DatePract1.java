import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;

public class DatePract1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(str1,dtf);

        System.out.println("Input date is :>> " + date.format(dtf));
    }
}
