/* Only square matrices can be transposed using swaping*/
import java.util.Scanner;
public class transposeUsingSwaping {
    static void printMatrix(int m[][]){
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[i].length; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] transposeUsingSwaping(int m[][],int r,int c){
        for (int i=0; i<c; i++){
            for (int j=i; j<r; j++){
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
    return m;
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
        int transpose[][]=transposeUsingSwaping(matrix,a,b);
        System.out.println("Transpose of matrix is: ");
        printMatrix(transpose);
    }
}