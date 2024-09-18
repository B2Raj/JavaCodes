import java.util.*;
public class circumferenceOfCircle{
    public static int circumference(int r){
        int c=2*3.14*r;
        return c;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r=sc.nextInt();
        circumference(r);
        System.out.print("Circumference of circle is: "+circumference(r));
        
    }
}