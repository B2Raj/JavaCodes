import java.util.*;
public class deleteElementsFromArray {
    public static int[] removeElement(int[] arr,int target){
        int newArray[]=new int[arr.length-1];
        int n=arr.length;
        int idx=0; // this index for new array
        for (int i=0; i<n; i++){
            if(arr[i]!=target){
                newArray[idx]=arr[i];
                idx++;
            }
        }
        return newArray;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array's elements: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target to remove: ");
        int target=sc.nextInt();
        int newArray[]=removeElement(arr,target);
        System.out.print("Required array is: "+Arrays.toString(newArray));
    }
}
