import java.util.Scanner;
public class reverseUsingStringBuffer {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        int revNo=0;
        StringBuffer sb=new StringBuffer(String.valueOf(n));
        StringBuffer rev=sb.reverse();
        System.out.println(rev);
    }
}
