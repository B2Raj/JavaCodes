import java.util.Scanner;
import java.util.Stack;
public class minBracketsToMakeBalance{
    public static void minBracketsToBeRemove(String str){
        Stack <Character> st=new Stack<>();
        int n=str.length();
        int size=0;
        for (int i=0; i<n; i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            } else{
                if(st.size()==0){
                    System.out.println("Balanced.");
                }
                if(st.peek()==')'){
                    st.pop();
                }
                size=st.size();
            }
        }
        System.out.println("Minimun no of brackets that we need to remove to make the given brackets sequence balanced is: "+size());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Brackets: ");
        String str=sc.nextLine();
        minBracketsToBeRemove(str);
    }
}