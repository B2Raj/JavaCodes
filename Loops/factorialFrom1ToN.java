import java.util.*;
public class factorialFrom1ToN{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        int fact=1;
        for (int i=1; i<=n; i++){
            fact*=i;
            System.out.println("Factorial of "+i+" is: "+ fact);
        }
    }
}