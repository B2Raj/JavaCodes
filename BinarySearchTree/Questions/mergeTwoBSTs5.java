import java.util.Scanner;
import java.util.ArrayList;
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
public class mergeTwoBSTs5 {
    public static Node BuildTree(Scanner sc){
        System.out.print("Enter data: ");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        Node root=new Node(data);
        System.out.println("Enter data for left of "+data);
        root.left=BuildTree(sc);
        System.out.println("Enter data for right of "+data);
        root.right=BuildTree(sc);
        // And now finally we will return root of the tree
        return root;
    }
    public static void getInorder(ArrayList<Integer> arr,Node root){
        if(root==null){
            return;
        }
        getInorder(arr,root.left);
        arr.add(root.data);
        getInorder(arr,root.right);
    }
    public static Node createFinalBST(ArrayList<Integer> arr,int si,int li){
        // si is starting index and li is lastIndes
        int mid=(si+li)/2;
        if(si>li) return null;
        Node root=new Node(arr.get(mid));
        root.left=createFinalBST(arr,si,mid-1);
        root.right=createFinalBST(arr,mid+1,li);
        // and now finally we will return the root of finalBST
        return root;
    }
    public static Node mergeBSTs(Node root1,Node root2){
      //  step1 -> make array or arrayList to store the inorder sequences of both the tree
        ArrayList<Integer> arr1=new ArrayList<>();
        getInorder(arr1,root1);
        ArrayList<Integer> arr2=new ArrayList<>();
        getInorder(arr2,root2);
     // step2 -> after geting inorder sequences of both the BSTs, both arrayList will be in sorted order. Now make another final arrayList or array to store the final sorted inorder sequence from both the BSTs using mergeSort and store it into final ArrayList or array
        ArrayList<Integer> finalArray=new ArrayList<>();
        int i=0, j=0;   // i and j are the variable for iterating BSTs one and two respectively.-
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalArray.add(arr1.get(i));
                i++;
            } else{
                finalArray.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            finalArray.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finalArray.add(arr2.get(j));
            j++;
        }
      // now, we have sorted order of both the BSTs
      // STEP-4:- make finalBST using sorted array as we know and finally we can return the final BST
      return createFinalBST(finalArray,0,finalArray.size()-1); 
    }
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node root1=null;
        Node root2=null;
        System.out.println("----->First tree.");
        root1=BuildTree(sc);
        System.out.println("----->Second tree.");
        root2=BuildTree(sc);
        Node finalRoot=mergeBSTs(root1,root2);
        // now out final tree is created. As a reference we can perfom some traversal like preOrder or postOrder to check wether tree is correctly built or not
        System.out.print("PreOrder: ");
        preOrder(finalRoot);
    }
}