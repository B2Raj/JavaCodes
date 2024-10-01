import java.util.Scanner;
import java.util.*;
public class insertElementInHeap {
    static class Head{
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data){
            // add at last idx
            arr.add(data);
            int child=arr.size()-1; // Child idx
            int parent=(child-1)/2;  // parent index
            while(arr.get(child)<arr.get(parent)){  // O(log n)
                // swap
                int temp=arr.get(child);
                arr.set(child,parent);
                arr.set(parent,temp);
            }
        }
    }
    public static void main(String[] args){
        
    }
}