import java.util.*;
public class greeting{
    public static void main(String[] args) {
        System.out.print("Enter Your choice:");
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        if(button==1){
            System.out.print("Hello...");
        }
        else if(button==2){
            System.out.print("Namaste...");
        }
        else if(button==3){
            System.out.print("Bonjour...");
        }
        else{
            System.out.print("Invalid choice.");
        }
    }
}