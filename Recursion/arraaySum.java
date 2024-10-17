import java.util.*;
public class arraaySum {
    static int arraySumAlgo(int arr[], int idx){
        if(arr.length-1==idx){
            return arr[idx];
        }
        return arr[idx]+arraySumAlgo(arr,idx+1);
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
        System.out.print("Sum of array is: "+arraySumAlgo(arr,idx));
    }
}
