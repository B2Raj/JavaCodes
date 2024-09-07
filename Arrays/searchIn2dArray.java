import java.util.*;
public class searchIn2dArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter cols: ");
        int cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        System.out.println("Enter elements of array:");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your array is: ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter element to search: ");
        int x=sc.nextInt();
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
               if(arr[i][j]==x){
                System.out.print("Element found at indes: ");
                System.out.print("("+i+","+j+")");
                break;
               }
            }
        }
    }
}