import java.util.*;
public class strictlyGreater{
    static void countNo(int arr[], int x){
        int count=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.print(count+" elements are greater than "+x);
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
            System.out.print("Enter a no.: ");
            int x=sc.nextInt();
            countNo(arr,x);
    }
}