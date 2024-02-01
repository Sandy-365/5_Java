package Methods;
import java.util.*;

public class method {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your name ::>> ");
        String name = read.next();
        System.out.print("Enter your age ::>> ");
        byte age = read.nextByte();
        System.out.println(hello(name,age));
        read.close();
    }
    static String hello(String Name, byte Age){
        System.out.println("printing Hello "+Name+" your age is "+Age);
        String s = "returning hello "+Name+" your age is "+Age;
        return s;
    }
}
