import java.util.Stack;
import java.util.Scanner;
public class copyStackUsingArray {
    public static void main(String[] args) {
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
            temp.push(st.pop());
        }
        System.out.println(temp);
    }
}
