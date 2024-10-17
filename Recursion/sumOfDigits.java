import java.util.*;
public class sumOfDigits {
    static int sumDigit(int n){
        if(n>=0 && n<=9){
            return n;
        }
        return sumDigit(n/10) + sumDigit(n%10);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        System.out.print("Sum of digits is: "+sumDigit(n));
    }
}
