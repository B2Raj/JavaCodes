import java.util.*;
public class arrayUsingLoop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        // arr[0]=2;
        // arr[2]=4;
        // arr[4]=21;
        // arr[3]=53;
        // arr[1]=56;
        // in java, if there is no elements filled in array, there is automatic initialisation with 0.
        for (int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}