package JavaCollectionFramework.SetInterface;
//package CollectionFramework.ListInterface.SetInterface;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.*;
import java.util.Scanner;
    public class linkedHashSet {
    public static void hashSetExample(){
        LinkedHashSet <Integer> ll=new LinkedHashSet<>();
        ll.add(1);
        ll.add(12);
        ll.add(31);
        ll.add(4);
        ll.add(5);
        System.out.println(ll); // 1 2 3 4 5
        ll.add(4);
        ll.add(2);
        ll.add(2);
        ll.add(6);
        System.out.println(ll);// 1 2 3 4 5 6
        ll.remove(3);
        System.out.println(ll);//  1 3 4 5 6
        System.out.println(ll.contains(4)); // true
        System.out.println(ll.contains(19)); // false
        System.out.println(ll.size());  // 5
    }
    public static void main(String[] args){
        hashSetExample();
    }
}