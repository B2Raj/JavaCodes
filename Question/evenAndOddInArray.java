import java.util.*;
public class evenAndOddInArray {
    public static void oddEvenAlgo(int arr[]){
        int n=arr.length;
        int odd=0;
        int even=0;
        for (int i=0; i<n; i++){
            if(arr[i]%2==0) even++;
            else odd++;
        }
        System.out.println("Even no.: "+even);
        System.out.println("Odd no.: "+odd);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array' elements: ");
        // for taking input of array's elements
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        oddEvenAlgo(arr);
    }
}
