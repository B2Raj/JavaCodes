import java.util.*;
public class powerSecondMethod {
    static int powerAlgo(int a,int b){
        if(b==0){
            return 1;
        }
        int baseResult=powerAlgo(a,b/2);
        if(b%2==0){     // even case
            return baseResult*baseResult;
        }
        // odd case
        return a*baseResult*baseResult;
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base: ");
        int a=sc.nextInt();
        System.out.print("Enter power: ");
        int b=sc.nextInt();
        System.out.print(a+" raise to the power "+b+" is: "+powerAlgo(a,b));
    }
}
