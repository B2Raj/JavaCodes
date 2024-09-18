import java.util.*;
public class averageOfThree{
    public static void average(int a, int b, int c){
        int sum=(a+b+c)/3;
        System.out.print(sum);
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three no.: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.print("Average of three no. is: ");
        average(a,b,c);
    }
}