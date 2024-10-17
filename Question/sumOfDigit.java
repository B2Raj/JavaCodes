import java.util.*;
public class sumOfDigit {
    static void sumOfDigitAlgo(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            n/=10;
            sum+=rem;
        }
        System.out.println("Sum of digits is: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sumOfDigitAlgo(n);
    }
}
