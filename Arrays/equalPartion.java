import java.util.*;
public class equalPartion{
    static int arraySum(int arr[]){
        int n=arr.length;
        int totalSum=0;
        for (int i=0; i<n; i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalPartionAlgo(int arr[]){
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
        boolean result=equalPartionAlgo(arr);
        System.out.println();
        System.out.print("Equal sum partion: "+result);
    }
}