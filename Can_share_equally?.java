import java.util.Scanner;
public class sons{
    public static void main(String[] aes){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n%2==0 && (n>0|| m%2==0) )
            System.out.print("YES");
        else 
            System.out.print("NO");
    }
}