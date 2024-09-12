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
public class treeToBST {
    public static Node BuildTree(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter data: ");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        Node root=new Node(data);
        System.out.println("Enter data for left of "+data);
        root.left=BuildTree();;
        System.out.println("Enter data for right of "+data);
        root.right=BuildTree();
        return root;
    }
    public static void getInorder(Node root,ArrayList<Integer> inorder){
        if(root==null) return;
        getInorder(root.left,inorder);
        inorder.add(root.data);
        getInorder(root.right,inorder);
    }
    public static Node createBST(ArrayList<Integer> inorderList,int si,int li){
        int mid=(si+li)/2;
        if(si>li)return null;
        Node root=new Node(inorderList.get(mid));
        root.left=createBST(inorderList,si,mid-1);
        root.right=createBST(inorderList,mid+1,li);
        return root;
    }
    public static Node BuildBST(Node root){
        ArrayList<Integer> inorderList=new ArrayList<>();
        getInorder(root,inorderList);
        // now we have sorted arrayList from binary tree.
        createBST(inorderList,0,inorderList.size()-1);
        return root;
    }
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root=null;
        root=BuildTree();
        BuildBST(root);
        preOrder(root);
    }
}