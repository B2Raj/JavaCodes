import java.util.*;
public class firstRepeatation {
    static int repeatation(int arr[]){
        int ans=-1;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                   return ans=arr[i];
                    
                }
            }
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
        int result=repeatation(arr);
        System.out.print("First repeatation digits are: "+result);
    }
}
