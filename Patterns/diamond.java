import java.util.*;
public class diamond{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
            // for upper half part
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" "+" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*"+" ");
            }
            for (int l=2; l<=i; l++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
            // for lower half part
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i-1; j++){
                System.out.print(" "+" ");
            }
            for (int k=1; k<=n+1-i; k++){
                System.out.print("*"+" ");
            }
            for (int l=1; l<=n-i; l++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}