import java.util.*;
public class maxOfArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array's elements: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int ans=0;
        for (int i=0; i<n; i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.print("Max of array: "+ans);
    }
}