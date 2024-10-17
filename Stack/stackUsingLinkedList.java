import java.util.Scanner;
public class stackUsingLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class Stack{
       private Node head=null;
       private int size=0;
        void push(int x){
            Node newNode=new Node(x);
            newNode.next=head;
            head=newNode;
            System.out.println(x+" is pushed.");
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is empty.");
                return -1;
            }
            int x=head.data;
            head=head.next;
            System.out.println(x+" is poped.");
            size--;
            return x;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is empty.");
                return -1;
            }
            return head.data;
        }
        int isSize(){
            return size;
        }
        boolean isEmpty(){
            if(isSize()==0){
                return true;
            } return false;
        }
        /* This will print straight data, but we have to print in reverse order, so we will user recursion
        void display(){
            Node temp=head;
            while(head!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            } System.out.print("null");
        }
            */
        // void displayUsingRecursion(Node h){
        //     if(h.next==null){
        //         return;
        //     }
        //     displayUsingRecursion(h);
        //     System.out.print(h.data+" ");
        // }
        // void display(){
        //     displayUsingRecursion(head);
        //     System.out.println();
        // }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack st=new Stack();
        System.out.println(st.isEmpty());
        st.push(4);
        st.push(3);
        st.push(80);
        st.push(34);
        st.push(14);
        st.push(23);
        st.push(820);
        st.push(314);
        st.push(45);
        st.push(63);
        System.out.println(st.isSize());
        st.pop();
     //   st.display();
        System.out.println(st.peek());
        st.push(333);
      //  st.display();
        System.out.println(st.isEmpty());
    }
}
