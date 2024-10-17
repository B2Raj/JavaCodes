import java.util.Stack;
public class stackUsingSTL {
    public static void main(String[] args){
        Stack <Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        st.push(3);
        st.push(2);
        st.push(52);
        st.push(33);
        st.push(44);
        int x=st.pop();
        st.push(x);
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        //int y=st.pop();
        // System.out.println(st.size());
    }
}