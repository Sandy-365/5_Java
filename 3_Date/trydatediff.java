import java.util.*;
import java.time.*;
import java.time.format.*;

public class trydatediff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate date1 = LocalDate.parse(str1, dtf);
            LocalDate date2 = LocalDate.parse(str2, dtf);

            Period dif = Period.between(date1, date2);

            String s = String.format("%d Years %d Months %d Days", dif.getYears(), dif.getMonths(), dif.getDays());
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
