import java.util.*;
public class maxOfArray {
    public static void maxAlgo(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            if(arr[i]>max) max=arr[i];
        }
        System.out.println("Max of array is: "+max);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        maxAlgo(arr);
    }
}
