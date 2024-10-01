//package CollectionFramework.ListInterface.queueInterface.java;
import java.util.Deque;
import java.util.*;
public class deque {
    public static void dequeExample(){
      Deque<Integer> de=new ArrayDeque<>();
      de.addFirst(8);
      de.addFirst(31);
      de.addFirst(77);
      de.addFirst(89);
      de.addLast(32);
      de.addLast(34);
      de.addLast(31);
      de.addLast(67);
     System.out.println(de); // 89 77 31 8 32 34 31 67
     System.out.println(de.pollFirst()); //89
     System.out.println(de.pollLast()); // 67
     System.out.println(de.poll()); // 77
     System.out.println(de.pollLast()); //31
     System.out.println(de.peek()); //31
     System.out.println(de.peekLast()); // 43
     System.out.println(de.peekFirst());  //31
     System.out.println(de);
    }
    public static void main(String[] args){
        dequeExample();
    }
}