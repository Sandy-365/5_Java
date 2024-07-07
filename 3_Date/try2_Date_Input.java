import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class try2_Date_Input {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Date input here ::>> ");
        // String str = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dtf11 = DateTimeFormatter.ofPattern("yyyyMMdd");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // try {
            // LocalDate date1 = LocalDate.parse(str, dtf);
            // System.out.println("Formatted date ::>> " + dtf2.format(date1));
        // } catch (Exception e) {
            // System.out.println("Error");
        // }

        String s1="02012022";
        String s2 = new StringBuilder(s1).reverse().toString();
        System.out.println(s2);
        LocalDate date3 = LocalDate.parse(s2,dtf11);
        System.out.println(date3);


        // LocalDate date1 = LocalDate.parse(s1,dtf);
        // System.out.println(dtf2.format(date1));
        // LocalDate date2 = dtf2.format(date1);
        // System.out.println(date2);

    }
}
