import java.util.Scanner;

class EnteringNameFromUser {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name ::>> ");
        name = sc.next();

        System.out.print("Hello " + name + " how are you");

    }
}