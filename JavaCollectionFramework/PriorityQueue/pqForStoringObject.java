import java.util.Scanner;
import java.util.PriorityQueue;
public class pqForStoringObject{
    static class Students implements Comparable<Students>{
        String name;
        int rank;
        Students(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Students s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args){
        PriorityQueue<Students> pq=new PriorityQueue<>();
        pq.add(new Students("A",3));
        pq.add(new Students("B",2));
        pq.add(new Students("C",7));
        pq.add(new Students("D",1));
        pq.add(new Students("E",5));
        pq.add(new Students("F",3));
        while(!pq.isEmpty()){
         System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
}