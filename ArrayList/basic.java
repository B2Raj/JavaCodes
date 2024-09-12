import java.util.ArrayList;
public class basic {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        // get() keyword is used to access the array element
        System.out.println(arr.get(0));
        System.out.println(arr.get(3));
        // printing all the elements using loop
        for (int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        // printing all the elements without loops
        System.out.println(arr);
        // adding elements at some index i
        arr.add(2,7);
        System.out.println(arr);
        //modifying elements at index i
        arr.set(3,8);
        System.out.println(arr);
        // removing elements for index i
        arr.remove(4);
        System.out.println(arr);
        // remove an element e
        arr.remove(Integer.valueOf(7));
        System.out.println(arr);
        
    }
}
