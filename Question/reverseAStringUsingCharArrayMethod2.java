import java.util.*;
public class reverseAStringUsingCharArrayMethod2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        // using character arr through which we can store all the charaters in the char array and then by traversing the char arr we can get the reverse
        // so to create char arr
        char arr[]=str.toCharArray();
        int len=arr.length;
        String rev="";
        for ( int i=len-1; i>=0; i--){
          //  int j=len-i-1;
            rev+=arr[i];
        }
        System.out.println("Reverse is: "+rev);
    }
}
