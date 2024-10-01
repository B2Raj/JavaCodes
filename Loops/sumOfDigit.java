import java.util.*;
public class sumOfDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.: ");
        int n=sc.nextInt();
        int sumOfDigit=0;
        int _n=n;
        while(n>0){
            sumOfDigit+=n%10;
            n/=10;
        }
        System.out.print("Sum of digits of "+_n+" is: "+sumOfDigit);
    }
}