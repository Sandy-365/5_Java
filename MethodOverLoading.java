package Methods;

public class MethodOverLoading {
    int plusMethod(int x, int y) {
        return x + y;
      }
      
    //   static double plusMethod(double x, double y) {
    //     return x + y;
    //   }
      
      public static void main(String[] args) {
        MethodOverLoading mt=new MethodOverLoading();

        int myNum1 = mt.plusMethod(8, 5);

        // double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
       // System.out.println("double: " + myNum2);
      }
}
