import java.util.*;
public class countOfEvenOrOdd{
    static void countDigitAlgo(int n){
        int even=0;
        int odd=0;
        while(n>0){ // 3357
            int rem=n%10;
            n/=10;
            if(rem%2==0){     // even case
                even++;
            } else odd++;   // odd case
        }
        System.out.println("Count of even is: "+even);
        System.out.println("Count of odd is: "+odd);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        countDigitAlgo(n);
        // int even=0;
        // int odd=0;
        // while(n>0){ // 3357
        //     int rem=n%10;
        //     n/=10;
        //     if(rem%2==0){     // even case
        //         even++;
        //     } else odd++;   // odd case
        // }
        // System.out.println("Count of even is: "+even);
        // System.out.println("Count of odd is: "+odd);
    }
}