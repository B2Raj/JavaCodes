import java.util.*;
public class moveZeroToEnd{
    public static void printArray(int[] arr){
        int n=arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void moveZero(int[] arr){
        int n=arr.length;
        for (int i=0; i<n-1; i++){  // for no of passes
            for (int j=0; j<n-1-i; j++){    //for traversing
                // for checking the condition
                if(arr[j]==0 && arr[j+1]!=0){
                    // swapping the condition
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Array after moveZero: ");
        printArray(arr);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array's elements: ");
        // for taking input of array's elements
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        moveZero(arr);
    }
}