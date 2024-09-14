package Questions;
import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class heightOfTree{
    public static Node BuildTree(){
        Node root=null;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter data: ");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("Enter data for left of "+data);
        root.left=BuildTree();
        System.out.println("Enter data for right of "+data);
        root.right=BuildTree();
        return root;
    }
    public static int HeightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=HeightOfTree(root.left);
        int rightHeight=HeightOfTree(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public static void main(String[] args){
        Node root=null;
        root=BuildTree();
        HeightOfTree(root);
        System.out.println(HeightOfTree(root));
    }
}