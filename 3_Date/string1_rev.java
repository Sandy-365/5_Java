import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class string1_rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE");

        LocalDate date1 = LocalDate.parse(str1, dtf);
        System.out.println(date1.format(dtf2));

    }
}