import java.util.*;
public class bubbleSort{
    public static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter arrat's elements: ");
        int arr[]=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        // Bubble sort      
        for (int i=0; i<n-1; i++){ // for no of passes   
            // for traversing the array
            for (int j=0; j<n-i-1; j++){
                // checking the condition
                if(arr[j]>arr[j+1]){
                    // for swappint the condition
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        // for displayint the sorted array
        System.out.print("Your sorted array is: ");
        printArray(arr);
    }
}