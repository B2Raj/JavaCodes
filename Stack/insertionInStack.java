import java.util.Stack;
import java.util.Scanner;
public class insertionInStack{
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
        System.out.print("Enter index to insert element: ");
        int idx=sc.nextInt();
        System.out.print("Enter element: ");
        int ele=sc.nextInt();   // ele==element
        Stack <Integer> temp=new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(ele); 
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println("Stack after "+ele+" is "+"inserting at index "+idx+" is: ");
        System.out.println(st);
    }
}