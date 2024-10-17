import java.util.*;
public class countOfDigits {
    static int countDigit(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        // int count=0;
        // // n=12345
        // while(n!=0){
        //     n/=10;
        //     count++;
        // }
        // return count;
        return  1+countDigit(n/10);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        System.out.print("Count of digit is: "+countDigit(n));
    }
}
