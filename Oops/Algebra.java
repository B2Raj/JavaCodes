import java.util.*;
class Algebra{
    int add(int a,int b){
        int ans=a+b;
        return ans;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st no.: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd no.: ");
        int b=sc.nextInt();
        Algebra alg=new Algebra();
        int ans=alg.add(a,b);
        System.out.print("The sum is: "+ans);
    }
}