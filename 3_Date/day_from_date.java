import java.util.*;
import java.text.*;
import java.ParseException;

public class day_from_date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        SimpleDateFormat sd = new SimpleDateFormat("EEEE-dd-mm-yyyy");
        Calendar c = Calendar.getInstance();
        // Calendar d = Calendar.getInstance();

        try {
            Date d1 = sdf.parse(s);
            c.setTime(d1);

            System.out.println(sd.format(c.getTime()));

        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
