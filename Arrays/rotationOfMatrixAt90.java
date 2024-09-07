// Rotation of square matrix by 90 degree clockwise
import java.util.*;
public class rotationOfMatrixAt90{
    static void printMatrix(int matrix[][],int n,int m){
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void rotate(int matrix[][]){
        int n=matrix.length;
        // Step1:- transpose
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // Step1:- reverse of transpose
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n=sc.nextInt();
        System.out.print("Enter cols: ");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        System.out.println("Enter a matrix elements: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("OrigionalMatrix.");
        printMatrix(matrix, n,m);
        System.out.println("Matrix after rotated by 90 degree clockwise.");
        rotate(matrix);
        printMatrix(matrix,n,m);
    }
}