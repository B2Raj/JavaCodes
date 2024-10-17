import java.util.*;
public class mergeSort3 {
    public static void printArray(int[] arr){
        int n=arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void mergeArray(int[]arr,int si,int mid,int li){
        int n=arr.length;
        int n1=mid;    // size of left part array
        int []leftArray=new int[n1];
        for (int i=0; i<n1; i++){
            leftArray[i]=arr[i];
        }
        int n2=li-mid;  // size of right part array
        int rightArray[]=new int[n2];
        for (int i=mid; i<=li; i++){
            rightArray[i-mid]=arr[i];
        }
        int i=0, j=mid+1, k=0;
        while(i<n1 && j<n2){
            if(leftArray[i]<=rightArray[j]){
                arr[k]=arr[i];
                k++;
                i++;
            } else{
                arr[k]=arr[j];
                k++;
                j++;
            }
        }
        // for other remaining array's part if occured
        while(i<n1){
            arr[k]=leftArray[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k]=rightArray[j];
            k++;
            j++;
        }
    }
    static void mergeSort(int[] arr,int si,int li){
        // si is statingIndex and li is lastIndex
        int n=arr.length;
        int mid=(si+li)/2;
        if(si>=li){
            return;
        } 
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,li);
        mergeArray(arr,si,mid,li);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int[] arr=new int[n];
        // for taking input array's elements
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        printArray(arr);
    }
}
