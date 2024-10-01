package Questions;
public class nthNodeFromEnd{
    public static Node nthNode(Node head,int posi){
        Node temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        temp=head;
        int m=size-posi+1;// formula for node from
         //last if we have given first node.
        for (int i=0; i<m; i++){
            temp=temp.next;
        }
        return temp;
    }
}
public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public static void main(String[] args){
    // Scanner sc=new Scanner(System.in);
    Node a=new Node(3);
    Node b=new Node(2);
    Node c=new Node(5);
    Node d=new Node(9);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=null;
    Node head=a;
    Node result=nthNode(head,3);
    System.out.println(result.data);
}