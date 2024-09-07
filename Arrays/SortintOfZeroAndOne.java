/* Note:- Array consists of zeros and ones only */
import java.util.*;
public class SortintOfZeroAndOne {
    static void printArray(int arr[]){
        System.out.print("Your sorted array is: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sortingAlgo2(int arr[]){
        for (int i=0; i<arr.length; i++){  // no. of pass
            // for traversing the array
            for (int j=0; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        printArray(arr);
    }
    static void sortingAlgo(int arr[], int count){
        int n=(arr.length)-count;
        for (int i=0; i<n; i++){
            arr[i]=0;
        }
        for (int i=count; i<arr.length; i++){
            arr[i]=1;
        }
        printArray(arr);
    }
    static void sorting(int arr[]){
        int n=arr.length;
        int count=0;
        for (int i=0; i<n; i++){
            if(arr[i]==0){
                count++;
            }
        }
        sortingAlgo(arr,count);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int arr[]=new int[n];
        /// for taking input of array's elements
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        sorting(arr); // algorithm 1
       //sortingAlgo2(arr);   // algorithm 2

       /* Algorithm one is better than algorithm 2 */
    }
}
