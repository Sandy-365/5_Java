import java.util.Scanner;
import java.io.*;

public class try2_writing{
    public static void main(String[] args){
        File obj = new File("try2_writing.txt");
        try{
            obj.createNewFile();
            

        }catch(Exception e){
            System.out.println("file not created");
        }
    }
}