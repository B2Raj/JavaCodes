import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;
public class basic1{
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
    // Using "Comparator.reverseOrder()", priority follow in descending
        pq.add(4);
        pq.add(3);
        pq.add(1);
        pq.add(46);
        pq.add(0);
        pq.add(7);
        pq.add(9);
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");    // O(1)
            pq.remove();    // O(log n)
        }
    }
}