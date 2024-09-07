import java.util.*;
public class maxOfArray2 {
    static int max(int arr[]){
        int mx=Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
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
        int result=max(arr);
        System.out.print("Max of array is: "+result);
    }
}