import java.util.*;
public class countDigit{
    static void countDigitAlgo(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println("Total no. of digit is: "+count);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        countDigitAlgo(n);
    }
}