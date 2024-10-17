import java.util.*;
public class StringIsPallindromeOrNot{  
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        String rev="";
        for (int i=len-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        if(rev==str){
            System.out.println("String is pallindrome.");
        } else System.out.println("String is not pallindrome.");
    }
}