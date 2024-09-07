import java.util.*;
public class prefixSum3{
    static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] prefixSumAlgo(int arr[]){
        int n=arr.length;
        for (int i=0; i<n; i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int arr[]=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int prefixSum[]=prefixSumAlgo(arr);
        System.out.print("Prefix Sum: ");
        printArray(prefixSum);
    }
}