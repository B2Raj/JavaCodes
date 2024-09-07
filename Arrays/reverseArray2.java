import java.util.*;
public class reverseArray2 {
    static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void printArray(int arr[]){
        int n=arr.length;
        System.out.print("Your reversed array is: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void reverseArray(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        // for takint input of array
        int arr[]=new int[n];
        System.out.print("Enter your array's elements: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        reverseArray(arr);
        printArray(arr);
    }
}