//package HashMap;
import java.util.*;
/* Que:- Goven an array, fint the most frequent element in it. If there are multiple elements that appear a maximum no. of times, print any ont of them.
Ex:- n=6;
arr[]={1,3,2,1,4,1};
expected output is:- 1
*/
public class mostFrequentElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array's elements: ");
        // for taking input of array's elements
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> freq=new HashMap<>();
        for (int ele: arr){
            if(!freq.containsKey(ele)){
                freq.put(ele,1);
            } else {
                freq.put(ele,freq.get(ele)+1);
            }
        }
        System.out.println(freq.entrySet());
    }
}