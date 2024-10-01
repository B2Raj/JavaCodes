package JavaCollectionFramework.SetInterface;
//package CollectionFramework.ListInterface.SetInterface;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.*;
    public class treeSet {
    public static void hashSetExample(){
        TreeSet <Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(12);
        ts.add(31);
        ts.add(4);
        ts.add(5);
        System.out.println(ts); // 1 2 3 4 5
        ts.add(4);
        ts.add(2);
        ts.add(2);
        ts.add(6);
        System.out.println(ts);// 1 2 3 4 5 6
        ts.remove(3);
        System.out.println(ts);//  1 3 4 5 6
        System.out.println(ts.contains(4)); // true
        System.out.println(ts.contains(19)); // false
        System.out.println(ts.size());  // 5
    }
    public static void main(String[] args){
        hashSetExample();
    }
}
