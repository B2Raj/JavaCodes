import java.util.*;
public class targetSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // for taking input of array's elements
        System.out.print("Enter array's elements: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int pair1[];
        int pair2[];
        System.out.print("Enter a no.: ");
        int x=sc.nextInt();
        int count=0;
        // target sum
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
    System.out.println(count);
    }
}