// check wether array is palindrome or not
import java.util.*;
public class palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // for taking input of array
        System.out.print("Enter array's elements: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0; i<n; i++){
            int j=n-1-i;
            if(arr[i]==arr[j]){
                System.out.print("Array is palindrome.");
                break;
            }
            else{
                System.out.print("Not a palindrome.");
                break;
            }
        }
    }
}