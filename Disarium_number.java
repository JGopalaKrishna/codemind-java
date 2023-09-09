import java.util.*;
public class test{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int len = (int) (Math.log10(n)+1);
        int q=n,r,s=0;
        while(q!=0){
            r=q%10;
            s=s+(int)Math.pow(r,len);
            len--;
            q=q/10;
        }
        System.out.print(n==s?"True":"False");
    }
}