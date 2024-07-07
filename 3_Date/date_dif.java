import java.time.*;
import java.util.*;
import java.time.format.*;

class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate birthDate = LocalDate.parse(str1, dtf);
            LocalDate currentDate = LocalDate.parse(str2, dtf);

            // Calculate the difference between the dates
            Period period = Period.between(birthDate, currentDate);

            // Format the output
            String formattedAge = String.format("%d years %d months %d days", period.getYears(), period.getMonths(),
                    period.getDays());

            // Output the formatted age
            System.out.println("Age: " + formattedAge);
        } catch (Exception e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }

    }
}
