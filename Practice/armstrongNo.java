import java.util.*;
public class armstrongNo {
    static int countAlgo(int x){
        int count=0;
        while(x!=0){
            x/=10;
            count++;
        }
        return count;
    }
    static int powerAlgo(int x,int y){
        if(y==0) return 1;
        return x*powerAlgo(x,y-1);
    }
    static void armstrongAlgo(int x){
        int origionalNumber=x;
        int count=countAlgo(x);
        int powerSum=0;
        while(x!=0){
            int remainder=x%10;
            x=x/10;
            powerSum+=powerAlgo(remainder,count);
        }
        if(powerSum==origionalNumber){
            System.out.println("Armstrong no.");
        } else {
            System.out.println("Not a armstrong no.");
        }
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        armstrongAlgo(n);
    }
}
