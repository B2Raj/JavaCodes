import java.util.*;
public class print1toN {
    static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        System.out.print("No. are: ");
        print(n);
    }
}
