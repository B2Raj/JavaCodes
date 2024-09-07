import java.util.*;
public class additionOfMatrices{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n=sc.nextInt();
        System.out.print("Enter cols: ");
        int m=sc.nextInt();
        System.out.println("Enter matrix 1 elements: ");
        int matrix1[][]=new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter matrix 2 elements: ");
        int matrix2[][]=new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
    }
}