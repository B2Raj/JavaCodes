import java.util.*;
public class matrixMultiplication {
    static void printMatrix(int m1[][],int r,int c){
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void matrixMultiply(int m1[][],int r1,int c1, int m2[][], int r2, int c2){
        if(c1!=r2){
            System.out.print("Invalid rows and cols, multiplication not possible.");
            return;
        }
        int mul[][]=new int[r1][c2];
        // for summation of matrices
        for (int i=0; i<r1; i++){  // for rows only
            for (int j=0; j<c2; j++){ // for cols only
                for (int k=0; k<c1; k++){
                    mul[i][j]+=(m1[i][k]*m2[k][j]);
                }
            }
        }
        System.out.print("Multiplication of Matrices is: ");
        System.out.println();
        printMatrix(mul,r1,c2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Matrix 1 dimension.");
        System.out.print("Enter rows: ");
        int row1=sc.nextInt();
        System.out.print("Enter cols: ");
        int col1=sc.nextInt();
        int matrix1[][]=new int[row1][col1];
        System.out.println("Enter matrix1 elements: ");
        // for taking input of matrix1 elements
        for (int i=0; i<row1; i++){
            for (int j=0; j<col1; j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("--Matrix 1 elements-- ");
        printMatrix(matrix1,row1,col1);
        System.out.println("Matrix 2 dimension.");
        System.out.print("Enter rows: ");
        int row2=sc.nextInt();
        System.out.print("Enter cols: ");
        int col2=sc.nextInt();
        int matrix2[][]=new int[row2][col2];
        System.out.println("Enter matrix2 elements: ");
        // for taking input of matrix 2 elements
        for (int i=0; i<row2; i++){
            for (int j=0; j<col2; j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("--Matrix 2 elements-- ");
        printMatrix(matrix2,row2,col2);
        matrixMultiply(matrix1, row1, col1, matrix2, row2, col2);
    }
}