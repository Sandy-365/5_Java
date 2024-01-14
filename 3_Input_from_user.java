import java.util.Scanner;

class InputFromUser {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number ::> ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number ::>> ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.print("The sum of these numbers is ::>> ");
        System.out.println(sum);
    }
}
