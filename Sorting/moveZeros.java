import java.util.*;
public class moveZeros {
    static void moveZero(int arr[]){
        int n=arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i; j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int arr[]=new int[n];
        // for taking input of array's elements
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array consisting of zeros at last is: ");
        moveZero(arr);
    }
}