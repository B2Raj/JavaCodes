/*Given a number num and a vlaue k. Print k multiple of num.
for example:-num 12,k=3,then output is:12,24,36,48,60  */
import java.util.*;
public class kTimesMultiple {
    static void printMultiples(int n,int k){
       /*   ----> Without RECURSION
        for (int i=1; i<=k; i++){
            System.out.println(n*i);
        }
        */
        if(k==1){
            System.out.println(n);
            return;
        }
        printMultiples(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        System.out.print("Enter a value: ");
        int k=sc.nextInt();
        printMultiples (n, k);    
    }
}
