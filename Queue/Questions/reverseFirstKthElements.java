import java.util.*;
public class reverseFirstKthElements{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        System.out.println("Initial Queue.");
        System.out.println(q);
        Stack<Integer> st=new Stack<>();
        int k=sc.nextInt();
        for (int i=1; i<=k; i++){
            st.push(q.remove());
        }
        int count=1;
        while(count<=k){
            q.add(st.pop());
            count++;
        }
        for (int i=1; i<=q.size()-k; i++){
            q.add(q.remove());
        }
        System.out.println("Queue after ktimes reverse: ");
        System.out.println(q);
    }
}