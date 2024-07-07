package Methods;

public class change {
    public static void main(String[] args) {
        int[] ar = {3,4,5,6,7};
        int m=90;
        chage(ar); 
        System.out.println(ar[0] + " "+m);
    }
    static void chage(int[] ar){
        ar[0] = 900;
    }
}
