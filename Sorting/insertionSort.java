import java.util.*;
public class insertionSort{
    static void insertionSortAlgo(int arr[]){
        int n=arr.length;
        for (int i=1; i<n; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
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
        System.out.print("Your sorted array is: ");
        insertionSortAlgo(arr);
    }
}