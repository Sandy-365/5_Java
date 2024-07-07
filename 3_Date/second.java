package clas;

import java.util.*;
import java.text.*;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date (dd-MM-yyyy) :: ");
        String inputDate = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            // Parse the input date
            Date date = sdf.parse(inputDate);

            // Get the current date
            Date currentDate = new Date();

            // Calculate the difference in milliseconds
            long differenceInMillis = currentDate.getTime() - date.getTime();

            // Convert milliseconds to days
            long differenceInDays = differenceInMillis / (1000 * 60 * 60 * 24);

            // Output the difference
            System.out.println("Difference in days: " + differenceInDays);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}
