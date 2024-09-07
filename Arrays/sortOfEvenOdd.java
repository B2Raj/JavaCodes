import java.util.*;
public class sortOfEvenOdd {
    static void printArray(int arr[]){
        int n=arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortingAlgo(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]!=0 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
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
        // for taking input of array
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        sortingAlgo(arr);
        System.out.print("Your sorted of evenOdd array is: ");
        printArray(arr);
    }
}
