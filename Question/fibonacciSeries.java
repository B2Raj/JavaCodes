import java.util.*;
public class fibonacciSeries {
    static void fibo(int n){
        int n1=0, n2=1, sum=0;
        System.out.print("Fibo series of "+n+" is: ");
        System.out.print(n1+" "+n2);
        for (int i=2; i<n; i++){
            sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        fibo(n);
    }
}
