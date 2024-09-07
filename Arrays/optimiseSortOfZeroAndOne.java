import java.util.*;
public class optimiseSortOfZeroAndOne {
    static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int arr[], int i, int j){
        int n=arr.length;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sorting(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                // int temp=arr[left];
                // arr[left]=arr[right];
                // arr[right]=temp;
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
        printArray(arr);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int arr[]=new int[n];
        // for taking input of array's elements
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Your sorted array is: ");
        sorting(arr);
    }
}