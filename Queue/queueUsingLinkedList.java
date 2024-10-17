import java.util.*;
public class queueUsingLinkedList {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public class queue{
        int size=0;
        Node head=null;
        Node temp=null;
         void push(int value){
            Node newNode=new Node(value);
            if(size==0){
                head=temp=newNode;
                //return;
            } else{
                temp.next=newNode;
                temp=newNode;
            }
            size++;
        }
        public int pop(){
            if(size==0){
                System.out.println("Queue underFlow.");
                return -1;
            } 
            int x=head.data;
            head=head.next;
            size--;
            return x;
        }
        public int peek(){
            if(head==null){
                System.out.println("Queue is empty.");
                return -1;
            }
            return head.data;
        }
        public boolean isEmpty(){
            if(size==0){
                return true;
            } else return false;
        }
        public void display(){
            Node temp=head;
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return;
            }
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
      //  queueLL q=new queueLL();
      queueUsingLinkedList.queue q = new queueUsingLinkedList().new queue();
      System.out.println(q.isEmpty());
      System.out.println(q.size);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.display();
        System.out.println(q.size);
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.pop());
        System.out.println(q.pop());
        q.display();
        q.push(6);
        q.display();
        System.out.println(q.size);
        q.pop();
        q.display();
        System.out.println(q.size);
    }
}