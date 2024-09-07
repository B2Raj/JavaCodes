import java.util.*;
public class sumOfMatrices{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter cols: ");
        int cols=sc.nextInt();
        // for taking input of matrix 1
        System.out.print("Enter elements of matrix1 : \n");
        int arr1[][]=new int[rows][cols];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        // for taking input of matrix 2
        System.out.print("Enter elements of matrix 2: \n");
        int arr2[][]=new int[rows][cols];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        // for summation of matrices
        int sum[][]=new int[rows][cols];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        // for displayint the sum of matrices
        System.out.print("Sum of matrices is: \n");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}