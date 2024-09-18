import java.util.*;
public class fibonacci{
    public static int fibo(int n){
        if(n==1 || n==0){
            return 1;
        }
        else
            return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        fibo(n);
        System.out.print("Fibo of "+n+" is: "+fibo(n));
    }
}