package JavaCollectionFramework.ListInterface;
import java.util.Stack;
import java.util.*;
public class stackList {
    public static void stackExample(){
        System.out.println("----> Integer Stack");
        Stack <Integer> st=new Stack<>();
        System.out.println(st.isEmpty()); // true
        st.push(32);
        st.push(1);
        st.push(322);
        st.push(90);
        System.out.println(st);// 32 1 322 90
        st.pop();
        System.out.println(st); //32 1 322
        System.out.println(st.peek());// 322
        System.out.println(st.isEmpty()); // false
        System.out.println(st.size()); // 3
        System.out.println("----> String Stack");
        Stack <String> str=new Stack<>();
    /* we can use both push or add keyword to insert integer or string or data in the stack. 
    */
        System.out.println(str.isEmpty());// false
        str.push("Hii");
        str.push("this");
        str.push("is");
        str.push("Bittu");
        str.push("Raj");
        str.push("Raj");
       System.out.println(str);//Hii this is Bittu Raj Raj
       str.pop();
        System.out.println(str);//Hii this is Bittu Raj
        System.out.println(str.peek());// Raj
        System.out.println(str.isEmpty());// false
    }
    public static void main(String[] args){
        stackExample();
    }
}