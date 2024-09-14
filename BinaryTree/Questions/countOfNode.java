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
public class countOfNode {
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
    public static int countOfTreeNode(Node root){
        if(root==null){
            return 0;
        }
        int leftCount=countOfTreeNode(root.left);
        int rightCount=countOfTreeNode(root.right);
        return leftCount+rightCount+1;
    }
    public static void main(String[] args){
        Node root=null;
        root=BuildTree();
        System.out.print("No of nodes in tree is: "+countOfTreeNode(root));
    }
}
