import java.util.Scanner;
import java.util.ArrayList;
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
public class mergeTwoBSTs3 {
    public static Node BuildTree(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter data: ");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        } Node root=new Node(data);
        System.out.println("Enter data for left of "+data);
        root.left=BuildTree();
        System.out.println("Enter data for right of "+data);
        root.right=BuildTree();
        // and finally we will return root of binaryTree
        return root;
    }
    public static void getInorder(ArrayList<Integer> arr,Node root){
        if(root==null) return;
        getInorder(arr,root.left);
        arr.add(root.data);
        getInorder(arr,root.right);
    }
    public static Node createFinalBST(ArrayList<Integer> arr,int si,int li){
        // si is startingIndes and li is lastIndex of finalArr
        if(si>li){
            return null;
        }
        int mid=(si+li)/2;
        Node root=new Node(mid);
        root.left=createFinalBST(arr,si,mid-1);
        root.right=createFinalBST(arr,mid+1,li);
        return root;
    }
    public static Node mergeTwoBST(Node root1,Node root2){
      //  step1- get inOrder sequence of both the roots
        // also to store the inorder sequence for the roots we can use both array or arraylist as well
        ArrayList<Integer> arr1=new ArrayList<>();
        getInorder(arr1,root1);
        ArrayList<Integer> arr2=new ArrayList<>();
        getInorder(arr2,root2);
     //   step2- merge both the array in final array
        ArrayList<Integer> finalArray=new ArrayList<>();
                // Merge Sorting
        int i=0, j=0;// for iterating two arrayList
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalArray.add(arr1.get(i));
                i++;
            } else{
                finalArray.add(arr2.get(j));
                j++;
            }
        }
        // for other remaining elements if occurs
        while(i<arr1.size()){
            finalArray.add(arr1.get(i));
            i++;
        } while(j<arr2.size()){
            finalArray.add(arr2.get(j));
            j++;
        }
      // step3- create a final BST using final ArrayList and return it
       return createFinalBST(finalArray,0,finalArray.size()-1);
    }
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node root1=null;    // for first binaryTree
        Node root2=null;    //for second binaryTree
        System.out.println("fist binaryTree.");
        root1=BuildTree();
        System.out.println("Second binaryTree.");
        root2=BuildTree();
        Node finalRoot=mergeTwoBST(root1,root2);
        System.out.print("postOrderSequence: ");
        preOrder(finalRoot);
        System.out.println();
        System.out.print("preOrderSequence: ");
        postOrder(finalRoot);
    }
}