/* There is a binaryTree given, you are watching it from top, return all the nodes which we can see.
         Approach:-
         1.levelOrderTraversal 
         2. hashmap
         3. HorizontalDistance
 */
import java.util.Scanner;
import java.util.*;
import java.util.LinkedList;
import java.util.HashMap;
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
class info{     // for storing the info of node
    Node node;
    int hd;     // horizontalDistance
    info(Node node,int hd){
        this.node=node;
        this.hd=hd;
    }
}
public class topViewOfTree {
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
        // And now finally we will return root of tree
        return root;
    }
    public static void topView(Node root){
        // LevelOrderTraversal 
        Queue<info> q=new LinkedList<info>();
        HashMap<Integer,Node> map=new HashMap<>();
        int min=0, max=0;
        q.add(new info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            info curr=q.remove();
            if(curr==null){
                break;
            }else{
                q.add(null);
            }
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node);
            }
            if(curr.node.left!=null){
                q.add(new info(curr.node.left,curr.hd-1));
                min=Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new info(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }
        }
        for (int i=min; i<=max; i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node root=null;
        root=BuildTree(sc);
        topView(root);
    }
}