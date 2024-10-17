import java.util.*;
public class largestOfThree {
    public static void largestAlgo(int a,int b,int c){
        if(a>b && a>c){
            // a is largest and b is second largest
            System.out.println(a+" is largest.");
        } else if(b>a && b>c){
            // b is largest and a is second largest
            System.out.println(b+" is largest.");
        } else System.out.println(c+" is largest.");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three no.: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        largestAlgo(a,b,c);
    }
}