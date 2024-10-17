import java.util.*;
public class bubbleSort2 {
    static void bubbleSort(int arr[]){
        int n=arr.length;
        for (int i=0; i<n; i++){
            for (int j=0; j<n-1-i; j++){  // no. of passes
                if(arr[j]>arr[j+1]){  // for traversing
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }           
        }
        System.out.print("Your sorted array is: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        // this for each loop can also be used instead of for loop
        /* for (int i:arr){
         * System.out.print(i);
        } */
        System.out.println();
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
        bubbleSort(arr);
    }
}
