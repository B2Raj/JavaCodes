import java.util.*;
public class sortedOrNot{
    static boolean isSorted(int arr[]){
        boolean check=true;
        for (int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        System.out.print("Is sorted: "+check);
        return check;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // for taking input of array's elements
        System.out.print("Enter array's elements: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        isSorted(arr);
    }
}