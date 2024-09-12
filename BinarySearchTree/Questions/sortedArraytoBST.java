// note:- Array should be sorted
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
public class sortedArraytoBST {
    public static Node createBST(int[] arr,int si,int li){
        // si is startingIndes and li lastIndes
        if(si>li){
            return null;
        }
        int mid=(si+li)/2;
        Node root=new Node(arr[mid]);
        root.left=createBST(arr,si,mid-1);
        root.right=createBST(arr,mid+1,li);
        return root;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int arr[]=new int[n];
        // for taking input of array's elements
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Node root=createBST(arr,0,n-1);
        preOrder(root);
    }
}
