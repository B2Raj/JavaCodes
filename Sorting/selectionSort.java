import java.util.*;
public class selectionSort{
    public static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array elements: ");
        int arr[]=new int[n];
        // for takint input of array
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        // Selection sort
        for (int i=0; i<n-1; i++){    // no of passes
            int smallest=i;
            // for traversing the array
            for (int j=i+1; j<n; j++){
                // for checking the condition
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        // for displaying the sorted array
        System.out.print("Your sorted array is: ");
        printArray(arr);
    }
}