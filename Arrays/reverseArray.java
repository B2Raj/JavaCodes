import java.util.*;
public class reverseArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array's elements: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int arr2[]=new int[n];
        for (int i=0; i<n; i++){
            int j=n-1-i; 
            arr2[i]=arr[j];
        }
        System.out.print("Your reverse array is: ");
        for (int i=0; i<n; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
