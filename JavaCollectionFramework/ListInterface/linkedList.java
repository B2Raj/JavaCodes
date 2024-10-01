package JavaCollectionFramework.ListInterface;
import java.util.Scanner;
import java.util.LinkedList;
public class linkedList {
    static void linkedListExample(){
        LinkedList <Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);// 1 2 3 4
        System.out.println(ll.get(2));// 3
        ll.set(3,12);
        System.out.println(ll); // 1 2 3 12
        ll.add(32);
        System.out.println(ll); // 1 2 3 12 32
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        linkedListExample();
    }
}
