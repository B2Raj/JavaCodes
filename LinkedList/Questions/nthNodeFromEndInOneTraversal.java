package Questions;
public class nthNodeFromEndInOneTraversal {
    public static Node nthNode(Node head,int posi){
        Node temp=head;
        Node slow=head;
        Node fast=head;
        for (int i=1; i<=posi; i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
    Node a=new Node(3);
    Node b=new Node(2);
    Node c=new Node(5);
    Node d=new Node(9);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=null;
    Node head=a;
    Node ans=nthNode(head, 4);
    System.out.println(ans.data);
    }
}
