import java.io.*;

public class File3_Reading_BufferedReader {
    public static void main(String[] args) {
        File file = new File("File3_Reading_BufferedReader.txt");
        try {
            file.createNewFile();
            System.out.println(file.getAbsolutePath());
            FileWriter fw = new FileWriter(file);

        } catch (Exception e) {
            System.out.println("File alredy exist");
        }
    }
}
