import java.util.Random;
import java.util.*;
/* Random integer value is used to print any random integer from given range that is,if input is n then random value will generate upto (n-1) */
public class randomInteger {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int rand_value=rand.nextInt(1000);
        System.out.print(rand_value);
    }
}