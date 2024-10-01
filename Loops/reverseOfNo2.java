import java.util.*;
public class reverseOfNo2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        int _n=n;
        int ans=0;
        while(n>0){
            ans=ans*10+n%10;
            n/=10;
        }
        System.out.print("Reverse of "+_n+" is: "+ans);
    }
}