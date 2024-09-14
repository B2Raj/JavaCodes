package Questions;
import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
}
public class treeSum{
    public static Node BuildTree(){
        Scanner sc=new Scanner(System.in);
        Node root=null;
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
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        return leftSum+rightSum+root.data;
    }
    public static void main(String[] args){
        Node root=null;
        root=BuildTree();
        System.out.print("Sum of Nodes of Tree is: "+sum(root));
    }
}