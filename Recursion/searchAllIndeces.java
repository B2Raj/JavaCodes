import java.util.*;
public class searchAllIndeces {
    static void findIndex(int arr[], int idx, int target){
        if(arr.length==idx){
            return;
        }
        if(target==arr[idx]){
            System.out.print(idx+" ");
        }
        findIndex(arr,idx+1,target);
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
        System.out.print("Enter target: ");
        int target=sc.nextInt();
        int idx=0;
        findIndex(arr,idx,target);
    }
}
