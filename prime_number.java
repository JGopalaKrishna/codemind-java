import java.util.Scanner;
public class prime{
    public static void main(String[] asdf){
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt(),c=0;
        for(int i=1;i<=n;i++)
            if(n%i==0) c++;
        System.out.print(c==2?"prime":"not a prime");
    }
}