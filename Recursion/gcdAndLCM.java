import java.util.*;
public class gcdAndLCM {
    static int gcdAlgo(int x,int y){
        if(y==0){
            return x;
        }
        return gcdAlgo(y,x%y);
    }
    static void lcm(int x,int y){
        // lcm * gcd = x * y;
        int lCm=(x*y)/gcdAlgo(x,y);
        System.out.print("LCM is: "+lCm);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first no.: ");
        int x=sc.nextInt();
        System.out.print("Enter second no.: ");
        int y=sc.nextInt();
        System.out.println("GCD of "+x+" and "+y+" is: "+gcdAlgo(x, y));
        lcm(x,y);
    }
}
