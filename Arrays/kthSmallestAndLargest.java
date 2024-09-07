import java.util.*;
public class kthSmallestAndLargest{
    static void smallestLargest(int arr[],int x){
        Arrays.sort(arr);   // for sort the array
        int smallest=0;
        int largest=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==x){
                smallest=arr[i-1];
                largest=arr[i+1];
            }
        }
        System.out.println(x+"th Smallest: "+smallest);
        System.out.print(x+"th largest: "+largest);
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
        System.out.print("Enter a no.: ");
        int x=sc.nextInt();
        smallestLargest(arr,x);
    }
}