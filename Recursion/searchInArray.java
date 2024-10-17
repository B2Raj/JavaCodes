import java.util.*;
public class searchInArray {
    static boolean searchAlgo(int arr[], int idx, int target){
        if(idx==arr.length-1){
            return false;
        }
        if(arr[idx]==target){
            return true;
        }
        /* instead of this, we can directly return search(arr,idx+1, target) */
        if(searchAlgo(arr,idx+1,target)){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array's elements: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter your target: ");
        int target=sc.nextInt();
        int idx=0;
        if(searchAlgo(arr,idx,target)){
            System.out.print("Yes");
        } else{
            System.out.print("No");
        }
    }
}
