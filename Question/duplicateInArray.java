import java.util.*;
public class duplicateInArray {
    static void duplicateAlgo(int arr[]){
        int n=arr.length;
        int duplicate=0;
        boolean flag=false;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n-1; j++){
                if(arr[i]==arr[j]) {
             System.out.print("Duplicate element found."+arr[i]);
             flag=true;
                }
            }
        }
        if(flag==false) System.out.print("No duplicate");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int arr[]=new int[n];
        // for taking input array's elements
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        duplicateAlgo(arr);
    }
}
