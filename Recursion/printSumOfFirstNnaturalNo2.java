import java.util.Scanner;
public class printSumOfFirstNnaturalNo2 {
    public static void printSum(int i,int n,int sum){
        if(n==i){
            sum+=i;
            System.out.print(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        int i=1;    // for hitting the base condition
        int sum=0;  // for storing the sum
        printSum(i,n,sum);
    }
}