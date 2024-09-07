import java.util.*;
public class matrixSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter cols: ");
        int cols=sc.nextInt();
        System.out.println("Enter matrix1 elements: ");
        int matrix1[][]=new int[rows][cols];
        // for taking input of matrix1 elements
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter matrix2 elements: ");
        int matrix2[][]=new int[rows][cols];
        // for taking input of matrix2 elements
        for (int i=0;i<rows; i++){
            for (int j=0;j<cols; j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        int sum[][]=new int[rows][cols];
        // for summation of matrix
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        // for displaying the summation of matrices
        System.out.println("Summation of matrices is: ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
