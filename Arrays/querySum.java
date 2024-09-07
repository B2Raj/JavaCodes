 import java.util.*; 
 public class querySum {
    static int[] prefixSumAlgo(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter array's elements: ");
        int arr[] = new int[n];
        // For taking input of array's elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int prefixSum[] = prefixSumAlgo(arr);
        System.out.print("Enter no. of queries: ");
        int q = sc.nextInt();
        System.out.print("Enter left range: ");
        int l = sc.nextInt();
        System.out.print("Enter right range: ");
        int r = sc.nextInt();
        while (q-- > 0) {
            int ans=prefixSum[r]-prefixSum[l-1];
            System.out.println("Query sum: "+ ans);
        }
    }
}