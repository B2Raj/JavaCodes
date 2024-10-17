import java.util.*;
public class question1 {
    private static void printQueue(){
        Queue<Integer> q1=new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        // rear-> 5 4 3 2 1  <-front
        System.out.println(q1);
        Queue<Integer> q2=new ArrayDeque<>();
        while(q1.size()>0){
            System.out.print(q1.peek()+" ");
            q2.add(q1.poll());
        }
        while(q2.size()>0){
            q1.add(q2.poll());
        }
    }
    public static void main(String[] args){
        printQueue();
    }
}
