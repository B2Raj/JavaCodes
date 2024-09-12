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
public class searchInBST {
    public static Node BinarySearchTree(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        } else{
            if(root.data<val){
                root.right=BinarySearchTree(root.right,val);
            } else{
                root.left=BinarySearchTree(root.left,val);
            }
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null) return;
        else{
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    public static boolean searchInBst(Node root,int target){
        if(root==null){
            return false;
        } else if(root.data==target){
            return true;
        } else{
            if(root.data>target){//target is in left subtree
                return searchInBst(root.left,target);
            }else{
                return searchInBst(root.right,target);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node root=null;
        int node[]={1,2,5,32,6,3,7};
        for (int i=0; i<node.length; i++){
            root=BinarySearchTree(root,node[i]);
        }
        inOrder(root);
        System.out.println();
        System.out.print("Enter target: ");
        int target=sc.nextInt();
        System.out.print(searchInBst(root,target));
    }
}