import java.util.*;
public class sumOfOneToN {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return sum(n-1)+n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        System.out.print("Sum of "+n+" is: "+sum(n));
    }
}
