import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Time2_diffrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first time in HH:mm:ss format ::>> ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second time in HH:mm:ss format ::>> ");
        String str2 = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time1 = LocalTime.parse(str1, dtf);
        LocalTime time2 = LocalTime.parse(str2, dtf);

        System.out.println("Time1 is ::>> " + time1 + " Time2 is :>> " + time2);
        Duration dif = Duration.between(time1, time2);

        long hr = dif.toHours();
        long mn = dif.minusHours(hr).toMinutes();
        long ss = dif.minusHours(hr).minusMinutes(mn).toSeconds();

        System.out.println("Time diff is ::>> " + Math.abs(hr) + ":" + Math.abs(mn) + ":" + Math.abs(ss));
    }
}
