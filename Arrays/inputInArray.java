import java.util.*;
public class inputInArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter elements of array: ");
        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Your array is: ");
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}