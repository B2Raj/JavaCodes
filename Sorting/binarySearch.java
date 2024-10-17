import java.util.*;
// array should be sorted
public class binarySearch{
    public static boolean binarySearchAlgo(int arr[],int target){
        int n=arr.length;
        int st=0;
        int end=n-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==target){
                return true;
            } else if(target<arr[mid]){
                end=mid-1;
            } else{
                st=mid+1;
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
        System.out.print("Enter target: ");
        int target=sc.nextInt();
        boolean result=binarySearchAlgo(arr,target);
        System.out.println(result);
    }
}