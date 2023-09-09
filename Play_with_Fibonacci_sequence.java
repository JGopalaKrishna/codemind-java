import java.util.Scanner;
public class fibonacci{
    public static void main(String[] aswq){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,a1=0;
        System.out.printf("%d %d ",a,b);
        for(int i=0;i<n-2;i++){
            a1=b;
            b=a+b;
            System.out.printf("%d ",b);
            a=a1;
        }
    }
}