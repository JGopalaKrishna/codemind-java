import java.util.*;
public class wsa{
    public static void main(String[] awq){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            char ch=(char)(64+i);
            System.out.println(String.valueOf(ch+" ").repeat(i));
        }
    }
}