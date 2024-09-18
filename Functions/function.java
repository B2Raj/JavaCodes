import java.util.*;
public class function {
    public static void printMyName(String name) {
        System.out.print(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        printMyName(name);
    }
}
