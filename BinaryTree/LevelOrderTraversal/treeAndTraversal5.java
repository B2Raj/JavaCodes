import java.util.Scanner;
import java.util.LinkedList;
import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data=data;
        right=null;
        left=null;
    }
}
public class treeAndTraversal5 {
    public static Node BuildTree(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter data: ");
        int data=sc.nextInt();
        Node root=null;
        if(data==-1) return null;
        root=new Node(data);
        System.out.println("Enter data for left of "+data);
        root.left=BuildTree();
        System.out.println("Enter data for right of "+data);
        root.right=BuildTree();
        return root;
    }
    public static void levelOrderTraversal(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else q.add(null);
            } else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Node root=null;
        root=BuildTree();
        levelOrderTraversal(root);
    }
}
