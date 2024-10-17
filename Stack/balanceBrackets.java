import java.util.Scanner;
import java.util.Stack;
public class balanceBrackets {
    public static boolean isBalanced(String str){
        Stack <Character> st=new Stack<>();
        int n=str.length();
        for (int i=0; i<n; i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            } else {
                if(st.size()==0) return false;
                if(st.peek()=='(') st.pop();
            }
        }
        /* Balance condition:_if size of stack is zero than the paranthesis is balance else not balanced. */
        if(st.size()>0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter characters: ");
        String str=sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
