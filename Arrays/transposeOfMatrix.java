import java.util.*;
public class transposeOfMatrix{
    static void printMatrix(int m[][]){
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[i].length; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] transposeOfMatrix(int m[][],int a,int b){
        int ans[][]=new int[b][a];
        for (int i=0; i<b; i++){
            for (int j=0; j<a; j++){
                ans[i][j]=m[j][i];
            }
        }
        return ans;
    }
    // transpose wihtout extra matrix
    static void transpose(int m[][],int r,int c){
        // without using extra matrix
        for (int i=0; i<c; i++){
            for (int j=0; j<r; j++){
                System.out.print(m[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int a=sc.nextInt();
        System.out.print("Enter cols: ");
        int b=sc.nextInt();
        System.out.println("Enter matrix elements: ");
        int matrix[][]=new int[a][b];
        // for taking input of matrix elements 
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("---Transpose of matrix is using another matrix.--- ");
        int[][] transpose=transposeOfMatrix(matrix,a,b);
        printMatrix(transpose);
        System.out.println("---This Transpose is without creating extra matrix.---");
        transpose(matrix,a,b);
        System.out.println("---Transpose using swaping and without creating extra matrix.---");
    }
}