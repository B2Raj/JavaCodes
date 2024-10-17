import java.util.*;
public class arraysEquality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of arrays: ");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        // for taking input of array's elements
        System.out.print("Enter arr1 elements: ");
        for (int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter arr2 elements: ");
        for (int i=0; i<n; i++){
            arr2[i]=sc.nextInt();
        }
        boolean status=true;
        if(arr1.length==arr2.length){
            if(arr1.length==arr2.length){
                for (int i=0; i<arr1.length; i++){
                    if(arr1[i]!=arr2[i]) status=false;
                }
             } else status=false;
        }
        if(status==true) System.out.println("Equal");
        else System.out.println("Not equal.");
    }
}
