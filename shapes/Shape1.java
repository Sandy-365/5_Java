import java.util.Scanner;

public class Shape1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of shape ::>> ");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = height; k > i; k--) {
                System.out.print(" #");
            }
            System.out.println();
        }

        scanner.close();
    }
}
