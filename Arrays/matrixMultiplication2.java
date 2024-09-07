import java.util.*;
public class matrixMultiplication2{
    static void printMatrix(int m[][],int r,int c){
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void multiply(int m1[][],int r1,int c1,int m2[][],int r2,int c2){
        if(c1!=r2){
            System.out.print("Multiplication not possible: ");
            return;
        }
        int ans[][]=new int[r1][c2];
        for (int i=0; i<r1; i++){
            for (int j=0; j<c2; j++){
                for (int k=0; k<c1; k++){
                    ans[i][j]+=(m1[i][k]*m2[k][j]);
                }
            }
        }
        System.out.println("Multiplication of matrices is: ");
        printMatrix(ans,r1,c2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("---Matrix 1 Dimension---");
        System.out.print("Enter rows: ");
        int r1=sc.nextInt();
        System.out.print("Enter cols: ");
        int c1=sc.nextInt();
        int matrix1[][]=new int[r1][c1];
        System.out.println("Enter elements of matrix 1: :");
        // for taking input of array's elements
        for (int i=0; i<r1; i++){
            for (int j=0; j<c1; j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("---Matrix 2 Dimension---");
        System.out.print("Enter rows: ");
        int r2=sc.nextInt();
        System.out.print("Enter cols: ");
        int c2=sc.nextInt();
        int matrix2[][]=new int[r2][c2];
        System.out.println("Enter elements of matrix2: ");
        // for taking input of matrix 2
        for (int i=0; i<r2; i++){
            for (int j=0; j<c2; j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        multiply(matrix1,r1,c1,matrix2,r2,c2);
    }
}