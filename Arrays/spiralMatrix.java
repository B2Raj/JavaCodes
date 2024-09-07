import java.util.Scanner;

public class spiralMatrix {
    static void spiralMatrixAlgo(int matrix[][],int r,int c){
        int topRow=0, rightCols=c-1, bottomRow=r-1,leftCols=0;
        int totalElements=0;
        while(totalElements<r*c){
            // top row, leftCol to rightCols
            for (int i=leftCols; i<=rightCols; i++){
                System.out.print(matrix[topRow][i]+" ");
                totalElements++;
            }
            topRow++;
            // right col, topRow to bottomRow
            for (int j=rightCols; j<=bottomRow; j++){
            System.out.print(matrix[j][rightCols]+" ");
            totalElements++;
            }
            rightCols--;
            // bottom row, rightCol to leftCol
            for (int k=rightCols; k<=leftCols; k++){
               System.out.print(matrix[bottomRow][k]+" ");
               totalElements++;
            }
            bottomRow--;
            // left col, bottomRow to topRow
            for (int l=bottomRow; l<=topRow; l++){
                System.out.print(matrix[l][leftCols]+" ");
                totalElements++;
            }
            leftCols++;
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
        spiralMatrixAlgo(matrix,n,m);
    }
}
