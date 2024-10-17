import java.util.Scanner;
public class countSort {
    public static void printArray(int[] arr){
        int n=arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int maxOfArray(int []arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    static void countSortAlgo(int[] arr){
        int n=arr.length;
        int max=maxOfArray(arr);
        int[] count=new int[max+1];
        for (int i=0; i<n; i++){
            count[arr[i]]++;
        }
        int k=0;
        for (int i=0; i<count.length; i++){
            for (int j=0; j<count[i]; j++){
                arr[k++]=i;
            }
        }
        System.out.print("Your sorted array is: ");
        printArray(arr);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int arr[]=new int[n];
        // for taking input of array's elements 
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        countSortAlgo(arr);
    }
}
