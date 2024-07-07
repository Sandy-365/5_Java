package Methods;

public class Recursion {
    int LIMIT = 1000;

    void fun2(int n) {
        if (n <= 0)
            return;
        if (n > LIMIT)
            return;

        System.out.print(String.format("%d ", n));
        fun2(2 * n);
        System.out.print(String.format("%d ", n));
    }

    public static void main(String[] args) {
        Recursion obj = new Recursion();
        obj.fun2(10);
    }
}
