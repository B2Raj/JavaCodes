import java.util.*;
public class NoIsPallindromeOrNot{
    static int reverseOfNo(int n){
        int revNo=0;
        while(n>0){
            revNo=revNo*10+n%10;
            n/=10;
        }
        return revNo;
    }
    static void pallindrome(int n){
        reverseOfNo(n);
        if(reverseOfNo(n)==n){
            System.out.println("It is pallindrome.");
        } else System.out.println("Not a pallindrome.");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        pallindrome(n);
    }
}