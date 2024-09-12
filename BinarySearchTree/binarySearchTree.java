import java.util.*;
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
public class binarySearchTree {
    public static Node BinarySearchTree(Node root,int value){
        if(root==null){
            root=new Node(value);
            return root;
        } else{
            if(root.data>value){
                root.left=BinarySearchTree(root.left,value);
            } else{
               root.right=BinarySearchTree(root.right,value);
            }
        }
        // Now, finally we will return the root of the tree
        return root;
    }
    static void inOrder(Node root){
        if(root==null) return;
        else{
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node root=null;
        int node[]={2,1,3,5,4,7};
        for (int i=0; i<node.length; i++){
            root=BinarySearchTree(root,node[i]);
        }
        // as reference, we can perform inorder traversal traversal or some other traversal to check wether the tree is build correctly or not
        System.out.print("inOrder sequence: ");
        inOrder(root);
    }
}