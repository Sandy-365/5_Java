
// finding the sum of int from the file
public class try1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileReader fr = new FileReader("try1.txt");
            int letters;
            String s = "";
            while (fr.read() != -1) {
                s = s + (char) letters;
            }
            System.out.println(s);
            String[] in1 = s.split(" ");
            int val = 0;
            for(String i : in1){
                val = val + Integer.parseInt(i);
            }
            System.out.println("Sum of the intger is "+val);
        } catch (Exception e) {
            System.out.println("No file");
        }
    }
}

