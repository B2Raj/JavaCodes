import java.util.*;
public class  countOfNo{
    static void countArray(int arr[], int size, int x){
        int result=0;
        for (int i=0; i<size; i++){
            if(arr[i]==x){
                result++;
            }
        }
        System.out.print("No. of occurence of digit "+x+" is: "+result);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int arr[]=new int[n];
        // for taking input of array elements
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter elements to find the occurence: ");
        int x=sc.nextInt();
        countArray(arr, n, x);
    }
}