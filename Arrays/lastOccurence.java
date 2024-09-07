import java.util.*;
public class lastOccurence{
    static int occurence(int[] arr,int x){
        int lastIndex=-1;
        for (int i=0; i<arr.length; i++){
            if(x==arr[i]){
                lastIndex=i;
            }
        }
        System.out.print("Index of Last occurence of digit "+x+" is: "+lastIndex);
        return lastIndex;// -1 means not found in array
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array's elements: ");
        // for taking input of array's elements
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a no. to find its occurence: ");
        int x=sc.nextInt();
        occurence(arr,x);
    }
}