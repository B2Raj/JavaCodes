import java.util.*;
public class countDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        int _n=n;
        int digitCount=0;
        while(n>0){
            n/=10;
            digitCount++;
        }
        System.out.print("No. of digits is: "+digitCount);
    }
}