import java.util.*;
public class canVoteOrNot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a=sc.nextInt();
        if(a>=18 && a<=90){
            System.out.print("Can vote.");
        }
        else
        System.out.print("Cannot vote.");
    }
}