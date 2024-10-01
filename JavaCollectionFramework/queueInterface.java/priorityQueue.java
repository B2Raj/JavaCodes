//package CollectionFramework.ListInterface.queueInterface.java;
import java.util.Scanner;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.PriorityQueue;
public class priorityQueue {
    public static void priorityQueueExample(){
        //this priority give priority to the smallest data
        System.out.println("---->Priority queue");
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(187);
        pq.add(79);
        pq.add(12);
        pq.add(78);
        pq.add(43);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);

        // we can priority to largest data by using Comporator.reverseOrder() function
        System.out.println("---->Priority MAx queue");

        PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());
        p.add(187);
        p.add(79);
        p.add(12);
        p.add(78);
        p.add(43);
        System.out.println(p);
        System.out.println(p.poll());
        System.out.println(p);
        System.out.println(p.peek());
        System.out.println(p.poll());
        System.out.println(p);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        priorityQueueExample();
    }
}
