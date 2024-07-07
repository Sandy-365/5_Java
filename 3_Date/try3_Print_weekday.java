// import java.time.format.DateTimeFormatter;
// import java.time.LocalDate;
// import java.util.Scanner;

import java.*;

public class try3_Print_weekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date::>> ");
        String str = sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE");
        try {
            LocalDate date1 = LocalDate.parse(str, dtf);
            System.out.println("Day ::>> " + dtf2.format(date1));
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
