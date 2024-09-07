import java.util.*;
public class secondMax{
    static int max(int arr[]){
        int n=arr.length;
        int mx=Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            mx=arr[i];
        }
        return mx;
    }
    static void secondMax(int arr[]){
        int mx=max(arr);
        for (int i=0; i<arr.length; i++){
            if(arr[i]==mx){
                mx=Integer.MIN_VALUE;
            }
        }
        int secondMaximum=max(arr);
        System.out.print("Second max: "+secondMaximum);
        // return secondMaximum;
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
        int firstMax=max(arr);
        secondMax(arr);
        // int secondMx=secondMax(arr);
        // System.out.print("Second max of array is: "+secondMx);
    }
}