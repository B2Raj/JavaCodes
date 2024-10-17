public class queueUsingLinkedList2 {
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
        public void push(int value){

            Node newNode=new Node(value);
            if(head==null){
                head=temp=newNode;
            }
            temp.next=newNode;
            temp=newNode;
            size++;
        }
        public int pop()throws Exception{
            if(size==0){
                throw new Exception("Queue underFlow.");
            }
            int x=head.data;
            head=head.next;
            size--;
            return x;
        }
        public int peek()throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty.");
            }
            return head.data;
        }
        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty.");
                return;
            }
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)throws Exception{
        queueUsingLinkedList.queue q = new queueUsingLinkedList().new queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.display();
        System.out.println(q.size);
        System.out.println(q.peek());
        q.pop();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }
}
