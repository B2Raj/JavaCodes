//package Queue;
import java.util.Scanner;
public class queueUsingArray {
    public static class queue{
        int front=-1;
        int rear=-1;
        int size=0;
        // int capacity=sc.nextInt();
        int arr[]=new int[5];
        public void push(int data){
            if(rear==arr.length-1){
                System.out.println("Queue overFlow.");
                return;
            }
            if(front==-1){
                // front=rear=0;
                // arr[0]=data;
                front++;
            }
            rear++;
            arr[rear]=data; // or arr[++rear]=data;
            System.out.println(data+" is pushed.");
            size++;
        }
        public int pop(){
            if(size==0){
                System.out.print("Queue underFlow.");
                return -1;
            }
            front++;
            size--;
            return arr[front];
        }
        public int peek(){
            if(size==0){
                System.out.print("Queue is Empty.");
                return -1;
            }
            return arr[front];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty.");
            } 
            for (int i=front; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        queue q=new queue();
        System.out.println(q.size);
       // q.display();
      //  System.out.println(q.isEmpty());
      //  System.out.println(q.pop());
        q.push(412);
        q.push(33);
        q.push(322);
        q.push(331);
        q.push(12);
        q.push(21);
        q.push(32);
        q.push(22);
        q.display();
        System.out.println(q.size);
        q.pop();
        q.display(); 
        System.out.println(q.size);
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        System.out.println(q.size);
        // System.out.println(q.pop());
        // System.out.println(q.pop());
        // System.out.println(q.pop());
        // System.out.println(q.pop());
        // System.out.println(q.pop());
        System.out.println(q.isEmpty());
        q.push(11);
        q.display();
    }
}