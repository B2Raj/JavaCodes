import java.util.*;
public class rectangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no. of rows: ");
        int n=sc.nextInt();
        System.out.print("Enter a no. of cols: ");
        int m=sc.nextInt();
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}