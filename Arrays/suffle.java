import java.util.*;
public class suffle {
    static int[] suffle(int num[], int n){
        int arr[]=new int[2*n];
        for (int i=0; i<n; i++){
            arr[2*i]=num[i];
            arr[2*i+1]=num[n+i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int arr[]=new int[2*n];
        // for taking input of array's elements
        for (int i=0; i<2*n; i++){
            arr[i]=sc.nextInt();
        }
        int result[]=suffle(arr,n);
        System.out.println(result);
    }
}
