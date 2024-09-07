import java.util.*;
public class arrayIsSortedOrNot {
    public static boolean isSorted(int arr[], int idx){
        if(arr[idx]==arr.length-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        } else return isSorted(arr, idx+1);
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
        int index=0;
        System.out.println(isSorted(arr,index));
    }
}