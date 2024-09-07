import java.util.*;
public class equalSumPartition {
    static int arraySum(int arr[]){
        int totalSum=0;
        for (int i=0; i<arr.length; i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartitionAlgo(int arr[]){
        int n=arr.length;
        int totalSum=arraySum(arr);
        int prefixSum=0;
        for (int i=0; i<n; i++){
            prefixSum+=arr[i];
            int suffixSum=totalSum-prefixSum;
            if(prefixSum==suffixSum){
                return true;
            } 
        }
        return false;
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
        boolean result=equalSumPartitionAlgo(arr);
        System.out.print("Equal partion possible: "+result);
    }
}
