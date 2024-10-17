import java.util.*;
import java.util.Stack;
public class copyStack {
    public static void main(String[] args){
    Stack <Integer> st1=new Stack<>();
    System.out.println("--->stack 1");
    System.out.println("Origional stack");
    int x= st1.push(42);
    int y= st1.push(44);
    int z= st1.push(90);
    int a= st1.push(41);
    int b= st1.push(12);
    System.out.println(st1);
    Stack <Integer> st2=new Stack<>();
    System.out.println("--->stack 2");
    while(st1.size()>0){
        int c=st1.peek();
        st2.push(c);
        st1.pop();
    }
    System.out.println("Reverse of stack 1");
    System.out.println(st2);
    Stack <Integer> st3=new Stack<>();
    System.out.println("--->stack 3 copied of from stack 1");
    while(st2.size()>0){
        st3.push(st2.pop());
    }
    System.out.println(st3);
    }
}
