import java.util.*;
public class ter{
    public static void main(String[] as){
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int q=n,r,rev=0;
        while(q!=0){
            r=q%10;
            rev=rev*10+r;
            q=q/10;
        }
        System.out.print(n==rev?"True":"False");
    }
}