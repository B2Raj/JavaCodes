import java.util.*;
public class selectionSort2 {
    static void selectionSort(int arr[]){
        int n=arr.length;
        for (int i=0; i<n-1; i++){
            int mnIndex=i;
            for (int j=i+1; j<n; j++){
                if(arr[j]<arr[mnIndex]){
                    mnIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mnIndex];
            arr[mnIndex]=temp;
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
        // for taking input of array's elements
        for (int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Your sorted array is: ");
        selectionSort(arr);
    }
}