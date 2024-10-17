import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.LinkedList;
import java.util.Queue;
public class reverseQueue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Integer> qe=new LinkedList<>();
        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);
        System.out.println("Initial Queue:-");
        System.out.println(qe);
        Stack<Integer> st=new Stack<>();
        while(qe.size()>0){
            st.add(qe.remove());
        }
        while(st.size()>0){
            qe.add(st.pop());
        }
        System.out.println("Reversed Queue:-");
        System.out.println(qe);
    }
}
