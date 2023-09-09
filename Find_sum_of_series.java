import java.util.Scanner;
public class sumOfSeries{
    public static void main(String[] aqz){
        Scanner sc = new  Scanner(System.in);
        int n=sc.nextInt();
        double sumD=0;
        for(int i=1;i<=n;i++){
            double d=(double)1/i;
            sumD+=(d);
        }
        System.out.printf("%.2f",sumD);
    }
}