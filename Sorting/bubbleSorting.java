import java.util.*;
public class bubbleSorting{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int arr[]=new int[n];
        // for taking input of array
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        // Bubble sort
        for (int i=0; i<n-1; i++){
            // for traversing the array
            for (int j=0; j<n-1-i; j++){
                // for checkint the condition 
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        // for displayig the sorted array
        System.out.print("Your sorted array is: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}