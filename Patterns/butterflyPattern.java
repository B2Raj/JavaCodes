import java.util.*;
public class butterflyPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        //  for upper part of butterfly
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            for (int k=1; k<=n-i; k++){
                System.out.print(" "+" ");
            }
            for (int l=1; l<=n-i; l++){
                System.out.print(" "+" ");
            }
            for (int m=1; m<=i; m++){
            System.out.print("*"+" ");
            }
        System.out.println();
        }

    // for lower part of butterfly
    for (int i=1; i<=n; i++){
        for (int j=1; j<=n+1-i; j++){
            System.out.print("*"+" ");
        }
        for (int k=1; k<=i-1; k++){
            System.out.print(" "+" ");
        }
        for (int l=1; l<=i-1; l++){
            System.out.print(" "+" ");
        }
        for (int m=1; m<=n-i+1; m++){
            System.out.print("*"+" ");
        }
        System.out.println();
        }
    }
}