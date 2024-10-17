//package BackTracking;

/* only two direction is allowed, down and right. */
import java.util.*;
public class mazePath {
    private static void maze(int sr,int sc,int er,int ec,String str){
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(str);
            return;
        }
        maze(sr,sc+1,er,ec,str+"R");
        maze(sr+1,sc,er,ec,str+"D");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter cols: ");
        int cols=sc.nextInt();
        maze(1,1,rows,cols,"");
    }
}
