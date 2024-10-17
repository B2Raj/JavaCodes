import java.util.Scanner;
import java.util.Stack;
public class StackUsingUserInput {
    public static void main(String[] args){
    Stack <Integer> st=new Stack<>();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size of stack: ");
    int n=sc.nextInt();
    System.out.print("Enter stack elements: ");
    for (int i=1; i<=n; i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.print("Your stack is: ");
        System.out.println(st);
    } 
}
