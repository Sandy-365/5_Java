import java.util.Scanner;

class Hastag_After_Every_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        String[] w1 = s1.split("\\s");
        String ns = "";
        int l = w1.length;

        for (int i = 0; i < l; i++) {
            ns = ns + w1[i] + "#";
        }
        System.out.println("combined string is ::>> " + ns);
    }
}
