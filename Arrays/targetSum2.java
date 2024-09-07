import java.util.*;
public class targetSum2{
    static int pairSum(int arr[], int x){
        int count=0;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int arr[]=new int[n];
        // for takint input of array's elements
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a no.: ");
        int x=sc.nextInt();
        int count=pairSum(arr,x);
        System.out.print("No of pairs for the sum of "+x+" is: "+count);
    }
}