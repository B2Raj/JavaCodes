import java.util.*;
public class searchIndexInArray {
    static int findIndex(int arr[], int idx, int target){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        return findIndex(arr,idx+1,target);
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
        System.out.print("Enter your target: ");
        int target=sc.nextInt();
        int idx=0;
        System.out.print(findIndex(arr, idx, target));
    }
}