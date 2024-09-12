package Questions;
/* We have to make balanceb BST from unbalance binaryTree.Our approach will be, first we will find the inOrder sequence of unbalance binaryTree, store in a arrayList or array, then again we will sort the array then we can convert sorted array to BalancedBinaryTree.
 */
import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class bstToBalanceBST{
    public static void getInOrder(Node root,ArrayList<Integer> inOrder){
        if(root==null) return;
        getInOrder(root.left,inOrder);
        inOrder.add(root.data);
        getInOrder(root.right,inOrder);
    } 
    public static Node createBST(ArrayList<Integer> inorder,int si,int li){
        if(si>li){
            return null;
        }
        int mid=(si+li)/2;
        Node root=new Node(inorder.get(mid));
        root.left=createBST(inorder,0,mid-1);
        root.right=createBST(inorder,mid+1,li);
        return root;
    }
    public static Node BuildBalancedBST(Node root){
        // inOrder sequence
        ArrayList<Integer> inorder=new ArrayList<>();
        getInorder(root,inorder);
        // sorted Inorder --> balanced BST
        root=createBST(inorder,0,inorder.size()-1);
        return root;
    }
    // Normal Unbalanced Binary Tree
    public static Node BuildTree(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter data: ");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
            Node  root=new Node(data);
            System.out.println("Enter data for left of "+data);
            root.left=BuildTree();
            System.out.println("Enter data for right of "+data);
            root.right=BuildTree();
        return root;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node root=null;
        root=BuildTree();   // normal binaryTree
        BuildBalancedBST(root);
    }
}