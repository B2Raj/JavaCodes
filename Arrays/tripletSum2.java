import java.util.*;
public class tripletSum2{
    static int tripletPair(int arr[], int x){
        int count=0;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                for (int k=j+1; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        count++;
                    }
                }
            }
        }
        return count;
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
            System.out.print("Enter target sum: ");
            int x=sc.nextInt();
            int result=tripletPair(arr,x);
            System.out.print("Total triplet pair is: "+result);
    }
}