package Questions;
import java.util.*;
public class mirrorInBST {
    public static Node createMirror(Node root){
        if(root==null){
            return null;
        }
        Node leftMirror=createMirror(root.left);
        Node rightMirror=createMirror(root.right);
        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node root=null;
    }
}
