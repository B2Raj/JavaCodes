import java.util.Scanner;
public class mergeSort2{
    static void printArray(int[] arr){
        int n=arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSortedPart(int[]arr,int si,int mid,int li){
        int n1=mid+0-1;    // size of first sorted part
        int n2=li-mid;  // size of second sorted part
        int[] leftArr=new int[n1];
        int[] rightArr=new int[n2];
        for (int i=0; i<n1; i++){
            leftArr[i]=arr[i];
        }
        for (int i=mid+1; i<n2; i++){
            rightArr[i]=arr[i];
        }
        int i=si,j=mid+1,k=0;  // for iterating the array's
        while(i<mid-1 && j<li){
            if(leftArr[i]<rightArr[j]){
                arr[k]=leftArr[i];
                i++;
                k++;
            } else{
                arr[k]=rightArr[j];
                j++;
                i++;
            }
        }
        // for remainint part of both array's if occured
        while(i<n1){
            arr[i]=arr[j];
            i++;
            k++;
        } while(j<n2){
            arr[j]=arr[i];
            j++;
            k++;
        }
    }
    static void mergeSort(int[] arr,int si,int li){
        // si is stating index and li is lastIndex
        int n=arr.length;
        int mid=(si+li)/2;  // or mid=si+(li-si)/2
        if(si>=li){
            return;
        }
        mergeSort(arr,si,mid);  // left part
        mergeSort(arr,mid+1,li);  // right part
        mergeSortedPart(arr,si,mid,li);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int[] arr=new int[n];
        // for taking input of array's elements
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        printArray(arr);
    }
}