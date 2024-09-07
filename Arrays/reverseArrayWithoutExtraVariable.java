import java.util.*;
public class reverseArrayWithoutExtraVariable{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter size of array: ");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.print("Enter array's elements: ");
       // for taking input of array
       for (int i=0; i<n; i++){
        arr[i]=sc.nextInt();
       }
       int i=0;
       int j=n-1;
       while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
       }
       System.out.print("Your reversed array is: ");
       for (int k=0; k<n; k++){
           System.out.print(arr[k]+" ");   
       }
    }
}