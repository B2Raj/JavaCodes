import java.util.*;
public class power{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base: ");
        int a=sc.nextInt();
        System.out.print("Enter power: ");
        int b=sc.nextInt();
        int _b=b;
        int ans=1;
        while(b>0){
            ans=ans*a;
            b--;
        }
        System.out.print(a+" raise to the power "+_b+" is: "+ans);
    }
}