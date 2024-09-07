import java.util.*;
public class prefixSum2 {
    static void printArray(int arr[]){
        int n=arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    // without any extra array
    static int[] prefixSumAlgo(int arr[]){
        int n=arr.length;
        for (int i=1; i<n; i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
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
        int pref[]=prefixSumAlgo(arr);
        System.out.print("Prefix sum array is: ");
        printArray(pref);
    }
}
