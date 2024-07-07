import java.util.*;
import java.io.*;

public class File1_Creating_file {
    public static void main(String[] args) {
        File file = new File("File1.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("file already exist");
        }
    }
}
