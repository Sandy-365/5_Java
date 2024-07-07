package Methods;
import java.util.*;

public class AgeValidation {
    public static void main(String[] args){
        System.out.print("Enter yout age ::>> ");
        Scanner read = new Scanner(System.in);
        int age = read.nextInt();
        checkage(age);
        read.close();
    }
    static void checkage(int Age){
        if(Age<18){
            System.out.print("Not eligible to vote");
        }
        else{
            System.out.print("You can vote");
        }
    }
}
