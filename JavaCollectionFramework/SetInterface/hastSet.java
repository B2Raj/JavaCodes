package JavaCollectionFramework.SetInterface;
//package CollectionFramework.ListInterface.SetInterface;
import java.util.HashSet;
import java.util.*;
/* HashSet has property of arrnage the set in inOrder sequence and avoid duplicate elements.
*/
public class hastSet {
    public static void hashSetExample(){
        HashSet <Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(12);
        hs.add(31);
        hs.add(4);
        hs.add(5);
        System.out.println(hs); // 1 2 3 4 5
        hs.add(4);
        hs.add(2);
        hs.add(2);
        hs.add(6);
        System.out.println(hs);// 1 2 3 4 5 6
        hs.remove(3);
        System.out.println(hs);//  1 3 4 5 6
        System.out.println(hs.contains(4)); // true
        System.out.println(hs.contains(19)); // false
        System.out.println(hs.size());  // 5
    }
    public static void main(String[] args){
        hashSetExample();
    }
}
