import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Time1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time in HH:mm:ss format: ");
        String str1 = sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time1 = LocalTime.parse(str1, dtf);
        System.out.println("Time is: " + time1);
    }
}
