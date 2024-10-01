import java.util.*;
public class seriesSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        int ans=0;
        for (int i=1; i<=n; i++){
            if(i%2==0){ // even
                ans-=i;
            } else{
                ans+=i;
            }
        }
        System.out.print("Sum of series is: "+ans);
    }
}