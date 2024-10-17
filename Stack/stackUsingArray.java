import java.util.*;
public class stackUsingArray {
    public static class Stack{
        private int arr[]=new int[10];
        private int idx=0;
        void push(int x){
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is empty.");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is underFlow.");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            return false;
        }
        void display(){
            for (int i=0; i<idx; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        System.out.println(st.isEmpty());
        st.push(4);
        st.push(3);
        st.push(80);
        st.push(34);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.peek());
        st.push(333);
        st.display();
        System.out.println(st.isEmpty());
    }
}
