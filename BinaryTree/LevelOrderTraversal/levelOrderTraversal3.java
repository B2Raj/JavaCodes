package LevelOrderTraversal;
import java.util.*;
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
public class levelOrderTraversal3 {
    public static Node BuildTree(){
        Scanner sc=new Scanner(System.in);
        Node root=null;
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
    public static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    } 
    public static void levelOrderTraversal(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } q.add(null);
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        Node root=null;
        root=BuildTree();
        System.out.print("InOrderTraversal: ");
        inOrder(root);
        System.out.println();
        System.out.print("preOrderTraversal: ");
        preOrder(root);
        System.out.println();
        System.out.print("postOrderTraversal: ");
        postOrder(root);
        System.out.println();
        levelOrderTraversal(root);
    }
}