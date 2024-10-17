import java.util.Stack;
import java.util.Scanner;
public class stackDisplay{
    public static void main(String[] args){
        Stack <Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        st.push(3);
        st.push(2);
        st.push(52);
        st.push(33);
        st.push(44);
        System.out.println(st);
        Stack <Integer> temp=new Stack<>();
        while(!st.isEmpty()){
            int x=st.pop();
            temp.push(x);
        }
        while(!temp.isEmpty()){
            int x=temp.pop();
            System.out.print(x+"  ");
            st.push(x);
        }
        System.out.println();
        System.out.println(st);
    }
}