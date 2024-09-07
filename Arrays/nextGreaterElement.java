import java.util.*;
public class nextGreaterElement {
    static void printArray(int arr[]){
        int n=arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void nextGreater(int[] arr){
        int n=arr.length;
        int result[]=new int[n];
        for (int i=0; i<n; i++){
            result[i]=-1;
            for (int j=i+1; j<n; j++){
                if(arr[i]<arr[j]){
                    result[i]=arr[j];
                    break;
                }
            }
        }
        printArray(result);
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
        nextGreater(arr);
    }
}