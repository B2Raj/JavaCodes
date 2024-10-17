package Questions;
/* Find the first occurrence of a given element x, given that the given array is sorted. If no occurrence of x is found then return -1. */
// we have to solve this question using recursion
import java.util.*;
public class findOccurrence {
    public static int findOccurrence(int arr[],int target,int si,int li){
        int n=arr.length;
        int mid=si+(si-li)/2;
         if(arr[mid]==target){
            return 1;
        } else if(arr[mid]<target){
             findOccurrence(arr,target,mid+1,li);
        } else{
             findOccurrence(arr,target,0,mid-1);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int arr[]=new int[n];
        //for taking input of array's elements
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target=sc.nextInt();
        int result=findOccurrence(arr,target,0,n-1);
        System.out.println(result);
    }
}