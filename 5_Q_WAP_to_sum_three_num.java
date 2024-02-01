import java.util.Scanner;

class SumOfThreeNumber {
    public static void main(String[] args) {
        int num1, num2, num3, sum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number ::>> ");
        num1 = sc.nextInt();

        System.out.print("Enter the second number ::>> ");
        num2 = sc.nextInt();

        System.out.print("Enter the third number ::>> ");
        num3 = sc.nextInt();

        sc.close();

        sum = num1 + num2 + num3;

        System.out.print("Sum of " + num1 + "," + num2 + " and " + num3 + " is ::>> " + sum);

    }
}
