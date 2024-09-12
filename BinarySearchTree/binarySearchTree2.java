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
public class binarySearchTree2 {
    public static Node BinarySearchTree(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        } else{
            if(root.data>val){
                root.left=BinarySearchTree(root.left,val);
            }else{
                root.right=BinarySearchTree(root.right,val);
            }
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args){
        Node root=null;
        int nodeData[]={3,1,8,4,5,6,7,2,9};
        for(int i=0; i<nodeData.length; i++){
            root=BinarySearchTree(root,nodeData[i]);
        }
        // to check wether tree is build correctly or not, we can perform inOrder traversal. If our list or data of nodes of tree are sorted then out tree is build correctly.
        inOrder(root);
    }
}