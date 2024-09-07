import java.util.*;
public class tripletSum{
    static int triplet(int arr[],int x){
        int result=0;
        int n=arr.length;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                for (int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        result++;
                    }
                }
            }
        }
    return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int arr[]=new int[n];
        // for taking input of array
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target sum: ");
        int x=sc.nextInt();
        int count=triplet(arr,x);
        System.out.print("No. of triplets sum is: "+count);
    }
}