/* Ques. n=5. 1+2-3+4-5=ans */
import java.util.*;
public class alternateSum {
    static int alternateSumAlgo(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){     // even case, 1+2-3+4-5, here last digit is 4 that is even
            return alternateSumAlgo(n-1)-n;
        }
        // odd case, 1+2-3+4-5, here last digit is 5 that is odd
        return alternateSumAlgo(n-1)+n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        System.out.print("Alternate sum is: "+alternateSumAlgo(n));
    }
}
