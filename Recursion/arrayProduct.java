import java.util.*;
public class arrayProduct {
    static int arrayProductAlgo(int arr[], int idx){
        if(arr.length-1==idx){
            return arr[idx];
        }
        /*another base can be like 
        if(idx==n){
         return 0; 
        }
         */
        return arr[idx]*arrayProductAlgo(arr, idx+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array's elements: ");
        // for taking input of array's elements
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int idx=0;
        System.out.print("Product of array is: "+arrayProductAlgo(arr,idx));
    }
}
