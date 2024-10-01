import java.util.Scanner;
import java.util.LinkedList;
public class queue {
    public static void QueueExample(){
        // Queue works on fifo principle
        LinkedList <Integer> q=new LinkedList<>();
        System.out.println(q.isEmpty()); // true
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q);  // 1 2 3 4 5
        q.poll();// poll is used as pop to remove top ele.
        System.out.println(q);// 2 3 4 5
        System.out.println(q.peek()); //2
        System.out.println(q.isEmpty()); // false
    }
    public static void main(String[] args){
        QueueExample();
    }
}
