import java.util.*;
public class printArray {
    
    static void printArrayAlgo(int arr[], int idx){
        if(idx==arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");
        printArrayAlgo(arr,idx+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array's elements: ");
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int idx=0;
        System.out.print("Array's elements using recursion is: ");
        printArrayAlgo(arr,idx);
    }
}
