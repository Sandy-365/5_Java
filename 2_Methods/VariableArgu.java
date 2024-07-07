package Methods;

public class VariableArgu {
    static int sum(int a, int... args) {
        int result = a;
        for (int i : args) {
            result = result + i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1 and 2 is : : >> "+sum(1,2));
        System.out.println("Sum of 1,2 and 3 is : : >> "+sum (1,2,3));
        System.out.println("Sum of 1,2,3 and 4 is : : >> "+sum (1 ,2,3,4));
    }
}
