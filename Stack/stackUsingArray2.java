import java.util.*;
public class stackUsingArray2 {
    public static class Stack{
        private
        int arr[]=new int[10];
        int idx=-1;
        void push(int x){
            if(isFull()){
                System.out.println("Stack overFlow.");
                return;
            }
            idx++;
            arr[idx]=x;
            System.out.println(arr[idx]+" is pushed.");
        }
        void pop(){
            if(idx==0){
                System.out.print("Stack underFlow.");
                return;
            }
            idx--;
            System.out.print(arr[idx+1]+" is popped.");
            System.out.println();
        }
        int peek(){
            System.out.print("Top element is: ");
            return arr[idx];
        }
        boolean isEmpty(){
            if(idx==-1){
                return true;
            } else return false;
        }
        int size(){
            System.out.print("Size of stack is: ");
            return idx+1;
        }
        boolean isFull(){
            if(idx==9){ // size is 10,so the index will be(n-1)because array are o based idx that is 9.
                return true;
            } else return false;
        }
        void display(){
            for (int i=0; i<=idx; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack st=new Stack();
        System.out.println(st.isEmpty());
        st.push(4);
        st.push(3);
        st.push(80);
        st.push(34);
        st.push(4);
        st.push(3);
        st.push(80);
        st.push(34);
        st.push(4);
        st.push(3);
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.peek());
        st.push(333);
        st.display();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
    }
}
