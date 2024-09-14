package Questions;
import java.util.*;
class Node{
    int data;
    Node right,left;
    Node(int data){
        this.data=data;
        right=null;
        left=null;
    }
}
public class heightOfTree2 {
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
    public static int HeightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=HeightOfTree(root.left);
        int rightHeithg=HeightOfTree(root.right);
        return Math.max(leftHeight,rightHeithg)+1;
    }
    public static void main(String[] args){
        Node root=null;
        root=BuildTree();
        System.out.print("Height of Tree is: "+HeightOfTree(root));
    }
}