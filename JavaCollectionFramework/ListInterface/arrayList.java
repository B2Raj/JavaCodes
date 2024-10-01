package JavaCollectionFramework.ListInterface;
import java.util.Scanner;
import java.util.ArrayList;
public class arrayList {
    static void ArrayListExample(){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(4);
        arr.add(1);
        arr.add(52);
        arr.add(511);
        System.out.println(arr); // 4 1 52 511
        System.out.println(arr.get(3));
        arr.set(2,33);
        System.out.println(arr);
        System.out.println(arr.contains(32));// false
        System.out.println(arr.contains(33));// true
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayListExample();
    }
}
