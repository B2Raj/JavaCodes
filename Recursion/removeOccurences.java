import java.util.Scanner;
public class removeOccurences {
    static String removeOccurencesAlgo(String s,String target,int idx){
        if(idx==s.length()){
            return "";
        }
        String smallAns=removeOccurencesAlgo(s, target, idx+1);
        char curreChar=s.charAt(idx);
        if(curreChar!=target){
            return curreChar+smallAns;
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        System.out.print("Enter target: ");
        String target=sc.next();
        int idx=0;
        removeOccurencesAlgo(s,target,idx);
    }
}
