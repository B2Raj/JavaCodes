package TreeTraversalMethods;
import java.util.*;

import Questions.Node;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class treeAndTraversal {
    static Node BuildTree(){
        Node root=null;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter data: ");
        int data=sc.nextInt();
        if(data==-1) return null;
        root=new Node(data);
        System.out.println("Enter data for left of "+data);
        root.left=BuildTree();
        System.out.println("Enter data for right of "+data);
        root.right=BuildTree();
        return root;
    }
    static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }
    static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }
    public static void main(String[] args){
        Node root=null;
        root=BuildTree();
        System.out.print("PreOrderTraversal:");
        preOrder(root);
        System.out.println();
        System.out.print("postOrderTraversal:");
        postOrder(root);
        System.out.println();
        System.out.print("inOrderTraversal:");
        inOrder(root);
    }
}
