import java.util.*;
public class lexicographicalOrder {
    public static void printFruits(String[] fruits){
        int n=fruits.length;
        for (int i=0; i<n; i++){
            System.out.print(fruits[i]+" ");
        }
    }
    public static void sortFruits(String[] fruits){
        int n=fruits.length;
        for (int i=0; i<n-1; i++){
            int minIndex=i;
            for (int j=i+1; j<n; j++){
                if(fruits[j].compareTo(fruits[minIndex])<0){
                    minIndex=j;
                }
            }
            String temp=fruits[i];
            fruits[i]=fruits[minIndex];
            fruits[minIndex]=temp;

        }
      //  printFruits(fruits);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of fruits: ");
        int n=sc.nextInt();
        System.out.print("Enter fruits name: ");
        String fruits[]=new String[n];
        for (int i=0; i<n; i++){
            fruits[i]=sc.nextLine();
        }
        sortFruits(fruits);
        printFruits(fruits);
    }
}