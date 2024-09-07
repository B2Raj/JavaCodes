import java.util.*;
public class sortSquare{
    static void printArray(int arr[]){
        int n=arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void reverse(int arr[]){
        int n=arr.length;
        for (int i=0; i<n; i++){
            int j=arr.length-1-i;
            arr[i]=arr[j];
            j--;
        }
    }
    static int[] sortSquareAlgo(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int ans[]=new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            } else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
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
        int result[]=sortSquareAlgo(arr);
        System.out.print("Your sorted square array is: ");
        reverse(result);
        printArray(result);
    }
}