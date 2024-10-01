package JavaCollectionFramework.MapInterface;
//package CollectionFramework.MapInterface;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.LinkedHashMap;
//import java.util.TreeMap;
public class hashMapLinkedHashMapAndTreeMapInterface {
    public static void hashMapExample(){
        System.out.println("------->HashMap");
        HashMap <Integer, String> hm=new HashMap<>();
        hm.put(3,"B2");
        hm.put(2,"Bittu");
        hm.put(1,"Vicky");
        hm.put(4,"Banti");
    System.out.println(hm);//1=Vicky 2=Bittu 3=B2 4=Banti
        hm.put(1,"raj");
    System.out.println(hm);//1=raj 2=Bittu 3=B2 4=Banti
        hm.putIfAbsent(1,"Raj");
    System.out.println(hm);//1=raj 2=Bittu 3=B2 4=Banti
        //arrange according to key value in ascendingOrder
        System.out.println(hm.get(2));  // Bittu
        System.out.println(hm.get(1));  // Vicky
        System.out.println(hm.containsKey(5));// false
        System.out.println(hm.containsKey(1));// true
        System.out.println(hm.containsValue("Bittu"));  // true
        System.out.println(hm.containsValue("b2"));//false
        System.out.println(hm.keySet());//1 2 3 4
    System.out.println(hm.values());//raj Bittu B2 Banti
    System.out.println("------->LinkedHashMap");
    LinkedHashMap<Integer,String> lh=new LinkedHashMap<>();
    // In linkedHashMap, order of insertion are preserved
    lh.put(1,"Bittu");
    lh.put(2,"Vicky");
    lh.put(4,"Satyam");
    lh.put(3,"Banti");
    System.out.println(lh);
    System.out.println(lh.size());
    System.out.println(lh.get(2));//vicky
    System.out.println(lh.containsKey(3));//true
System.out.println(lh.containsValue("Satyam"));//true
    System.out.println(lh.containsKey("B2"));// false
    System.out.println("------->TreeHashMap");
// in treeMap, sequence are in sorted order a/c keys
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(1,"Bittu");
        tm.put(2,"Banti");
        tm.put(5,"Vicky");
        tm.put(3,"B2");
        tm.put(4,"Shubham");
        System.out.println(tm);

    }
    public static void main(String[] args){
        hashMapExample();
    }
}
