import java.util.*;
class Node {
    int data;
    Node right;
    Node left;
    Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}
public class mergeTwoBST {
    public static Node BuildTree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data: ");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        Node root = new Node(data);
        System.out.println("Enter data for left of " + data);
        root.left = BuildTree();
        System.out.println("Enter data for right of " + data);
        root.right = BuildTree();
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
    public static Node makeFinalBST(ArrayList<Integer> arr,int si,int li){
        if(si>li){
            return null;
        }
        int mid=(si+li)/2;
        Node root=new Node(arr.get(mid));
        root.left=makeFinalBST(arr,si,mid-1);
        root.right=makeFinalBST(arr,mid+1,li);
        return root;
    }
    public static Node mergeTwoBSTs(Node root1,Node root2){
        // step1  
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        getInorder(root1,arr1);
        getInorder(root2,arr2);
        // step2 merge both inorder arraylist
        ArrayList<Integer> finalArray=new ArrayList<>();
        int i=0, j=0;   // for iterate the arrayList
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalArray.add(arr1.get(i));
                i++;
            } else{
                finalArray.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr2.size()){
            finalArray.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finalArray.add(arr2.get(j));
            j++;
        }
        // step3  sorted arrayList to BST
        return makeFinalBST(finalArray,0,finalArray.size()-1);
       // return root;
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
        Scanner sc = new Scanner(System.in);
        Node root1 = null;
        System.out.println("First BinaryTree.");
        root1 = BuildTree();
        System.out.println("Second BinaryTree.");
        Node root2 = null;
        root2 = BuildTree();
        Node finalRoot=null;
        finalRoot=mergeTwoBSTs(root1,root2);
        // preorder operation is performed for checking wether the bst is correct or not
        preOrder(finalRoot);
    }
}