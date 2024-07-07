import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class time3try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time ::>> ");
        String str1 = sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");

        LocalTime time1 = LocalTime.parse(str1, dtf);

        System.out.println("Adding 2h ");

        LocalTime time = time1.plus(2, ChronoUnit.HOURS);

        System.out.println("Time after adding 2h is ::>> " + time.format(dtf));
    }
}
