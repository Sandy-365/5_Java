import java.io.FileReader;
import java.util.Scanner;

public class try1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("try1.txt");
            int letters;
            String s = "";
            while ((letters = fr.read()) != -1) {
                s = s + (char) letters;
            }
            System.out.println(s);
            String[] in1 = s.split("\\s+");
            int val = 0;
            for (String i : in1) {
                val = val + Integer.parseInt(i);
            }
            System.out.println("Sum of the integers is: " + val);
            fr.close(); // Close the FileReader
        } catch (Exception e) {
            System.out.println("No file");
        }
    }}

     
    // s
    // pu y1 {
    //    static void main(String
    //     sc = new Scanner(System.in);
    //     
    //     
    //     
    //
    //             while ((letters=fr.read()) != -1)
    //                 s =
    //         }
    //     System.out.println(s);
    //     S
    // int val = 0;
    // for(String i : i
    //     val = val 
    // }
    // em.out.println("Sum of 
    // t
    // System.out.println("No
    // 
    // 
    // 
     the no of linescclasst

    ry1 {
    
//     public static void main(String[] args) {
//       
 /

//             int cnt=0;
//             while ((letters = fr.read()) != -1) {
//             if(letters == '\n'){
//             cnt++;
//         }
//     System.out.println(letters+"  =  "+ (char)letters);
//     s = s + (char) letters;
// }
// System.out.println("end");
// System.out.println(s+"\n now number of line =  "+cnt);
// (Exception e) {
// ut.println("No file");
// 
//   
//         