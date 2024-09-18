import java.util.*;
public class maxOfTwo {
    public static void max(int n, int m){
        if(n>m){
            System.out.print("First no. is maximum.");
        } else if(m>n){
            System.out.print("Second no. is Maximum.");
        } else
            System.out.print("Both are equal.");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first no.: ");
        int a=sc.nextInt();
        System.out.print("Enter second no.: ");
        int b=sc.nextInt();
        max(a,b);
    }
}
