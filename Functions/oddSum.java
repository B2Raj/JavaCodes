import java.util.*;
public class oddSum{
    public static int oddNoSum(int n){
        int sum=0;
        for (int i=1; i<=n; i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        oddNoSum(n);
        System.out.print("Odd no. sum from 1 to "+n+" is: "+ oddNoSum(n));
    }
}