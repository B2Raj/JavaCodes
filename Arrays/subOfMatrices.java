import java.util.*;
public class subOfMatrices{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter cols: ");
        int cols=sc.nextInt();
        System.out.println("Enter elelments of matrix 1: ");
        // for taking input of matrix one
        int matrix1[][]=new int[rows][cols];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of matrix2: ");
        // for taking input of matrix two
        int matrix2[][]=new int[rows][cols];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        // for difference of matrices
        int sub[][]=new int[rows][cols];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                sub[i][j]=matrix1[i][j]-matrix2[i][j];
            }
        }
        // for displaying the sum of matrices
        System.out.print("Difference of matrices is: \n");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(sub[i][j]+" ");
            }
            System.out.println();
        }
    }
}