import java.util.*;
public class calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st no.: ");
        int n=sc.nextInt();
        System.out.print("Enter 2nd no.: ");
        int m=sc.nextInt();
        System.out.print("Enter Your choice.");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':
            System.out.print("The sum is: ");
            System.out.print(n+m);
            break;
            case '-':
            System.out.print("The difference is: ");
            System.out.print(n-m);
            break;
            case '*':
            System.out.print("The product is: ");
            System.out.print(n*m);
            break;
            case '/':
            System.out.print("The division is: ");
            System.out.print(n/m);
            break;
            default:
            System.out.print("Invalid operation.");
        }
    }
}