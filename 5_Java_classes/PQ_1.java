import java.util.*;

public class PQ_1{
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(10);
        pq.add(5);
        pq.add(50);

        System.out.println(pq + "  " + pq.size() + "  " + pq.isEmpty());
        
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        
        // System.out.println(pq.peek());
        // System.out.println(pq.peek());

        Iterator<Integer> it = pq.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}