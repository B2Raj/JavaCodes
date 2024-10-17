//package Queue;
import java.util.*;
public class basicSTL {
    public static void queueExample(){
        Queue<Integer> q=new ArrayDeque<>();
        Queue<Integer> qe=new LinkedList<>();
        System.out.println(qe.isEmpty());
        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);
        System.out.println(qe.size());
        System.out.println(qe.isEmpty());
        qe.poll();// poll and remove,both are same
        System.out.println(qe.remove());
        System.out.println(qe);
        System.out.println(qe.peek());
        System.out.println(qe.size());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        queueExample();
       
}
