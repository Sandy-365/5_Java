// original values cannot be changed
package Methods;

import java.util.*;

public class PassByValue {
    public static int man =10;
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        System.out.println("Value of num before calling function ::>> " + num);
        System.out.println(man);
        fun(num);
        System.out.println(man);

        System.out.println("Value of num After calling function ::>> " + num);
        read.close();
    }
    
    static void fun(int num) {
        System.out.println("Function starts here");
        
        System.out.println(man);
        man=20;
        System.out.println("Value of num is recevied is " + num);

        num = num + 10;
        System.out.println("Value after function changed it " + num);

        System.out.println("Function ends here");
    }
}
