import java.util.*;
public class binarySearchUsingRecursion {
    static boolean binarySearch(int arr[],int target,int si,int li){
        int n=arr.length;
        int mid=(si+li)/2;
        if(si>li){
            return false;
        }
        if(arr[mid]==target){
            return true;
        } else if(target>arr[mid]){
            return binarySearch(arr,target,mid+1,li);
        } else{
            return binarySearch(arr,target,si,mid-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array's elements: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target=sc.nextInt();
        boolean result=binarySearch(arr,target,0,n-1);
        if(result==true){
            System.out.print("Element found in array.");
        } else System.out.print("Element is not present in array.");
    }
}
