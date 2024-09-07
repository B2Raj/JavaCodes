import java.util.*;
public class kthRotation {
    static void printArray(int arr[]){
        int n=arr.length;
        System.out.print("Your rotated array is: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseArray(int arr[],int i, int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotateArray(int arr[], int k){
        int n=arr.length;
        k=k%n;
        reverseArray(arr,0,n-k-1);
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int arr[]=new int[n];
        // for takint input of array
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter no. for rotation: ");
        int k=sc.nextInt();
        rotateArray(arr,k);
        printArray(arr);
    }
}