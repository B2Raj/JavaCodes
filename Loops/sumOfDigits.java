import java.util.*;
public class sumOfDigits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.: ");
        int n=sc.nextInt();
        int _n=n;
        int sumOfDigit=0;
        while(n>0){
            sumOfDigit+=n%10;
            n/=10;
        }
        System.out.print(sumOfDigit);
    }
}