package Methods;

import java.util.*;

public class StarShape1 {
    static void shape(int num) {
        for (int i = 0; i < num; i++) {
            for(int k=num;k>i;k--){
                System.out.print("@");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // static void shape(int num) {
    //     for (int i = 0; i < num; i++) {
    //         for (int j = 0; j <= i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Eter the height of shape ::>> ");
        int num = read.nextInt();
        shape(num);

        read.close();
    }
}
