import java.util.*;
public class smallestAndGreatest{
    static int[] smallAndGreat(int arr[]){
        int smallest=0;
        int greatest=0;
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++){
            smallest=arr[0];
            greatest=arr[arr.length-1];
        }
        int ans[]={arr[0],arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // for taking input of array'e elements
        System.out.print("Enter array's elements: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=smallAndGreat(arr);
        System.out.print("Smallest and greatest elements are: "+"["+ans[0]+","+arr[n-1]+"]");  
    }
}