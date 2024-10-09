import java.util.*;
public class gcd {
    static int calculateGcd(int x,int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        System.out.print("Enter another no.: ");
        int m=sc.nextInt();
        System.out.print("GCD is: "+calculateGcd(n, m));
    }
}