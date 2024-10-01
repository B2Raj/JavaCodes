import java.util.*;
public class tableOfN{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        System.out.println("Table of given no. is: ");
        for (int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }
}