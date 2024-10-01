import java.util.*;
public class firstNnaturalNo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        int sum=0;
        for (int i=1; i<=n; i++){
            sum+=i;
            }
    System.out.print("Sum of 1st n natural no. is: ");
    System.out.print(sum);
    }
}