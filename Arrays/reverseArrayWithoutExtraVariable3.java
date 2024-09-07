import java.util.*;
public class reverseArrayWithoutExtraVariable3 {
    static int[] reverseArray(int arr[]){
     //   int i=arr.length-1;
        int j=0;
        int ans[]=new int[arr.length];
        for (int i=arr.length-1; i>=0; i--){
            ans[j]=arr[i];
            j++;
        }
        return ans;
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
        int result[]=reverseArray(arr);
        System.out.print("Your reverse array is: ");
        for (int i=0; i<n; i++){
            System.out.print(result[i]+" ");
        }
    }
}
