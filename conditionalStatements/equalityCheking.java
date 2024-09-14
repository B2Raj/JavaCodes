import java.util.*;
public class equalityCheking{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st no.: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd no.: ");
        int b=sc.nextInt();
        if(a==b){
            System.out.print("Both no are equal.");
        }
        else if(a>b){
            System.out.print("1st no is greater.");
        }
        else
        System.out.print("2nd is greater.");
    }
}