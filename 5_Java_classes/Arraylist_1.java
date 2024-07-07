import java.util.ArrayList;

public class Arraylist_1 {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Sandy");
        cars.add("Mandy");
        cars.add("END");
        System.out.println(cars);
        System.out.println(cars.get(0));
        cars.set(0,"Anoo");
        System.out.println(cars);
    }
}
