import java.util.*;

import Questions.Node;
class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data=data;
    }
}
public class basic {
    public static Node BinarySearchTree(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        } else{
            if(root.data>val){
                root.left=BinarySearchTree(root.left,val);
            } else {
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
        int value[]={1,8,2,3,6,7};
        for (int i=0; i<value.length; i++){
            root=BinarySearchTree(root,value[i]);
        }
        // to verify that tree is build correctly, we can perform inOrder traversal.If the ouput is sorted then our tree is correctly built.
        inOrder(root);
    }
}