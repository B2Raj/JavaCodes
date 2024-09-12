/* Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node vlaues of subRoot and false otherwise. */
import java.util.Scanner;
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
public class subtreeOfAnotherTree {
    public static Node BuildTree(Scanner sc){
     //   Scanner sc=new Scanner(System.in);
        System.out.print("Enter data:");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        } Node root=new Node(data);
        System.out.println("Enter data for left of "+data);
        root.left=BuildTree(sc);
        System.out.println("Enter data for right of "+data);
        root.right=BuildTree(sc);
        // And finally we will return root of tree
        return root;
    }
    public static boolean isIdentical(Node root,Node subRoot){
        if(root==null && subRoot==null){
            return true;
        } else if(root==null || subRoot==null || root.data!=subRoot.data){
            return false;
        }
        if(!isIdentical(root.left,subRoot.left)){
            return false;
        } if(!isIdentical(root.right,subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubTree(Node root, Node subRoot){
        if(root==null) return false;    // base case
        if(root.data==subRoot.data){
            isIdentical(root,subRoot);
            return true;
        }
        boolean leftAns=isSubTree(root.left,subRoot);
        boolean rightAns=isSubTree(root.right,subRoot);

        return leftAns || rightAns;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node treeRoot=null;
        System.out.println("Defiine main Tree.");
        treeRoot=BuildTree(sc);
        System.out.println("Define subTree.");
        Node subTreeRoot=null;
        subTreeRoot=BuildTree(sc);
        System.out.print(isSubTree(treeRoot,subTreeRoot));
    }
}
