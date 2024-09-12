package Questions;
import java.util.Scanner;

import Node;

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
public class mergeTwoBSTs4 {
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
        // now finally we well return root
        return root;
    }
    public static void getInorder(Node root,ArrayList<Integer> arr){
        if(root==null) return;
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }
    public static Node makeFinalBST(ArrayList<Integer> arr,int si,int li){
        // si is statingIndex and li is lastIndex
        if(si>li) return null;
        int mid=(si+li)/2;
        Node root=new Node(arr.get(mid));
        root.left=makeFinalBST(arr,si,mid+1);
        root.right=makeFinalBST(arr,mid+1,li);
        return root;
    }
    public static Node mergeTwoBSTs(Node root1,Node root2){
       // step1- store the inorder sequence of both the roots in array or arrayList
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        getInorder(root1,arr1);
        ArrayList<Integer> arr2=new ArrayList<Integer>();
        getInorder(root2,arr2);
        // step2- merger both the BSTs and store in finalArray
        ArrayList<Integer> finalArray=new ArrayList<Integer>();
        int i=0, j=0; // for iterating the arrays
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalArray.add(arr1.get(i));
                i++;
            } else{
                finalArray.add(arr2.get(j));
                    j++;
                }
            }
            // for another remains elemets if occurs
            while(i<arr1.size()){
                finalArray.add(arr1.get(i));
                i++;
            } while(j<arr2.size()){
                finalArray.add(arr2.get(j));
                    j++;
                }
        // step3- now, from finalArray which is sorted, we can make a BST using defined method and after that we can return it
        return makeFinalBST(finalArray,0,finalArray.size()-1);
        }
        public static void preOrder(Node root){
            if(root==null) return;
            System.out.print(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void main(String[] args){
            Node root1=null;
            Node root2=null;
            System.out.println("First BST: ");
            root1=BuildTree();
            System.out.println("Second BST: ");
            root2=BuildTree();
            Node finalRoot=mergeTwoBSTs(root1,root2);
            System.out.print("preOrder Sequence: ");
            preOrder(finalRoot);
    }
}