import java.util.*;

import Questions.Node;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class basic1{
    public static void main(String[] args){
        Node root=null;
        root=BuildTree();
        System.out.println(root.data);// this will receive root data
    }
    static Node BuildTree(){
        Scanner sc=new Scanner(System.in);
        Node root=null;
        System.out.print("Enter data: ");
        int data=sc.nextInt();
        if(data==-1)return null;
        root=new Node(data);
        System.out.println("Enter data for left of  "+data);
        root.left=BuildTree();
        System.out.println("Enter data for right of "+data);
        root.right=BuildTree();
        return root;
    }
} 