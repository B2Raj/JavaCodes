import java.util.*;
public class car{   // car is the name of class that we created
    Scanner sc=new Scanner(System.in);
    int brake=2;
    int accelerator=1;
    int seat=4;
    public static void main(String[] args){
        car toyoto=new car();   // toyoto is an object
       car mercedes=new car();  // mercedes is an object
        System.out.println("Brake:"+toyoto.brake);
        System.out.print("accelerator:"+mercedes.seat);
    }
}