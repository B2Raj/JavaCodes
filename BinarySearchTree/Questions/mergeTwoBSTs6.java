import java.util.Scanner;
import java.util.ArrayList;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class mergeTwoBSTs6{
    public static Node BuildTree(Scanner sc){
        System.out.print("Enter data: ");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }Node root=new Node(data);
        System.out.println("Enter data for left of tree: "+data);
        root.left=BuildTree(sc);
        System.out.println("Enter data for right of tree: "+data);
        root.right=BuildTree(sc);
        //And now, finally we will return root of tree
        return root;        
    }
    public static void getInorder(Node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }
    public static Node createFinalBST(ArrayList<Integer> arr,int si,int li){
        // si is startingIndex and li lastIndex
        if(si>li){
            return null;
        }
        int mid=(si+li)/2;
        Node root=new Node(mid);
        root.left=createFinalBST(arr,si,mid-1);
        root.right=createFinalBST(arr,mid+1,li);
        return root;
    }
    static Node mergeBSTs(Node root1,Node root2){
        // step1- make two arrayList for storing the inOrder sequences of both the tree
        ArrayList<Integer> arr1=new ArrayList<>();
        getInorder(root1,arr1);
        ArrayList<Integer> arr2=new ArrayList<>();
        getInorder(root2,arr2);
        // step2- merge both the arrayLists in one arrayList
        ArrayList<Integer> finalArray=new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalArray.add(arr1.get(i));
                i++;
            }else{
                finalArray.add(arr2.get(j));
                j++;
            }
        }
    // for another remaining elements in arrayLists
        while(i<arr1.size()){
            finalArray.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finalArray.add(arr2.get(j));
            j++;
        }
    //step3-now create a required BST using finalArray and return it
        return createFinalBST(finalArray,0,finalArray.size()-1);
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node root1=null;
        Node root2=null;
        System.out.println("----> First Binarytree<----");
        root1=BuildTree(sc);
        System.out.println("---->Second BinaryTree<----");
        root2=BuildTree(sc);
        Node finalRoot=mergeBSTs(root1,root2);
        // Now, we have finalRoot's BST which is merged form of two BSTs. Now, we can perform some operations like inOrder,preOrder or postOrder traversal to check wether ther final mergerdBST built correct or not
        System.out.println("preOrder sequence.");
        preOrder(finalRoot);
    }
}