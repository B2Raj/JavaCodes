import java.util.PriorityQueue;
public class basic {
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(4);
        pq.add(1);
        pq.add(5);
        pq.add(7);
        pq.add(2);
        pq.add(0);
        pq.add(9);
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove();    // O(log n)
        }
    }
}
