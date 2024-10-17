import java.util.*;
public class reverseAString{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        String revString="";
        int length=str.length();
        for (int i=length-1; i>=0; i--){
            revString+=str.charAt(i);
        }
        System.out.println("Reverse is: "+revString);
    }
}