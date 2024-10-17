import java.util.Stack;
public class removeSequences {
    public static void printArray(int [] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] remove(int []arr){
        int n=arr.length;
        Stack <Integer> st=new Stack<>();
        for (int i=0; i<n; i++){
            if(st.size()==0 || st.peek()!=arr[i]){
                st.push(arr[i]);
            } 
          else  if(arr[i]==st.peek()){
              if (i==n-1 || arr[i]!=arr[i+1]) st.pop();
            }
        }
        int []result=new int[st.size()];
        for (int i=result.length-1; i>=0; i--){
            result[i]=st.pop();
        }
        return result;
    }
    public static void main(String[] args){
        int arr[]={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int result[]=remove(arr);
        printArray(result);
    }
}
