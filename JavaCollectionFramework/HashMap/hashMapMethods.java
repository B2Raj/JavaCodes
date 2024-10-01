//package HashMap;
import java.util.*;
public class hashMapMethods {
    public static void hashMap(){
// key and value can be conbination of any data types
// b/w the brackets of hashmap, string will be used as key and integer will be used as value
            // syntax
        HashMap<String,Integer> hm=new HashMap<>();
            // adding elements
        hm.put("Akash", 21);
        hm.put("Yash",16);
        hm.put("lav",17);
        hm.put("Rishika",19);
        hm.put("Harry",18);
    System.out.println(hm);//lav=17, Rishika=19, Yash=16, Harry=18, Akash=21
            // getting value of a key from the hashMap
        System.out.println(hm.get("Yash"));//16
// HashMap return null if key or value doesn't exist in it
        System.out.println(hm.get("Rahul"));//null
        System.out.println(hm.get(12)); //null
    // updating or changing the value of a key in hashMap
        hm.put("Akash",25);
        System.out.println(hm);// akash=25
/* "put" keyword shows two behavious, one is for insertion and another one if for to update the value if already exist,
*/
/*
" remove" keyword also show two behavious, one is to remove the key and return its value and another is to return null if we try to remove the key or value which doesn't exist in hashMap
*/
        System.out.println(hm.remove("Harry"));// 18
    System.out.println(hm.remove("Satyam"));//return null, because there is no satyam in hashMap

    // checking if a key exist in map or not
    System.out.println(hm.containsKey("Akash"));//true
   System.out.println(hm.containsKey("Bittu"));//false
    }
    public static void main(String[] args){
        hashMap();
    }
}
