import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class try3_Add_day_to_date {
   public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try{
            LocalDate date = LocalDate.parse(str,dtf);
            LocalDate date2 = date.plusDays(5);
            System.out.println(date2);
            
        }catch(Exception e){
            System.out.println("error");
        }
   } 
}
