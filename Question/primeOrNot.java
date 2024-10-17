import java.util.*;
public class primeOrNot {
    static void primeAlgo(int n){
        int count=0;
        if(n>1){
            for (int i=1; i<=n; i++){
                if(n%i==0) count++;
            }
            if(count==2) System.out.println("Prime no.");
            else System.out.println("Not a prime no.");
        } 
        else System.out.print("Not a prime no.");
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        primeAlgo(n);
    }
}
