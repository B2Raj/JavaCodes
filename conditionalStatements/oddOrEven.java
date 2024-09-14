import java.util.*;
public class oddOrEven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        System.out.print("The no.: ");
        if(n%2==0){
            System.out.print("Even");
        }
        else
            System.out.print("Odd");
    }
}