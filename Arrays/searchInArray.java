import java.util.*;
public class searchInArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter elements of array: ");
        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
            }
        System.out.print("Enter a search element: ");
        int x=sc.nextInt();
        for (int i=0; i<size; i++){
            if(arr[i]==x){
                System.out.print("The element is at index ");
                System.out.print(i);
                break;
            }
        }
    }
}