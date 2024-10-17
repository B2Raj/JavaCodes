import java.util.*;
public class mergeSort {
    static void printArray(int arr[]){
        int n=arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void mergeAlgo(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        int i,j,k;
        for (i=0; i<n1; i++){
            left[i]=arr[l+1];
        }
        for (j=mid; j<n2; j++){
            right[j]=arr[mid+1+j];
        }
        i=0;
        System.out.println(i);
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k]=left[i];
                k++;
                i++;
            } else{
                arr[k]=right[i];
                k++;
                i++;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k]=right[j]; 
            k++;
            j++;
        }
    }
    static void mergeSort(int arr[], int l, int r){
        int left=l;
        int right=r;
        int n=arr.length;
        int mid=(l+r)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,n-1);
        mergeAlgo(arr,left,mid,right);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter array's elements: ");
        int arr[]=new int[n];
        // for taking input of array elements
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        printArray(arr);
    }
}