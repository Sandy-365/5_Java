import java.util.Scanner;

class CalculatingPercentage {

    public static void main(String[] args) {
        Byte num1, num2, num3, num4, num5, outof;
        short sum;
        float per;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first subject marks ::>> ");
        num1 = sc.nextByte();

        System.out.print("Enter the second subject marks ::>> ");
        num2 = sc.nextByte();

        System.out.print("Enter the third subject marks ::>> ");
        num3 = sc.nextByte();

        System.out.print("Enter the fourth subject marks ::>> ");
        num4 = sc.nextByte();

        System.out.print("Enter the fifth subject marks ::>> ");
        num5 = sc.nextByte();

        System.out.print("Given marks are out of ::>> ");
        outof = sc.nextByte();

        sum = (short) (num1 + num2 + num3 + num4 + num5);

        per = ((float) sum / (outof * 5)) * 100;

        System.out.println("Total Marks : " + sum + " outof " + outof * 5);
        System.out.println("Percentage is ::>> " + per + " %");

    }
}