import java.util.*;
public class searchArray{
    public static void searchInArray(int arr[], int size,int x){
        int ans=-1;
        for (int i=0; i<size; i++){
            if(arr[i]==x){
                ans=i;
                break;
            } 
        }
        System.out.print("Element found at index: "+ans);
    }
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    // for taking input of array
    System.out.print("Enter array's elements: ");
    for (int i=0; i<n; i++){
        arr[i]=sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int x=sc.nextInt();
        searchInArray(arr,n,x);
    }
}