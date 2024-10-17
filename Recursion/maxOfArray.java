import java.util.*;
public class maxOfArray {
    static int maxAlgo(int arr[], int idx){
        if(arr.length-1==idx){
            return arr[idx];
        }
       int smallAns= maxAlgo(arr,idx+1);
        return Math.max(arr[idx],smallAns);
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
        int idx=0;
        System.out.print("Max of array is:"+maxAlgo(arr,idx));
    }
}
