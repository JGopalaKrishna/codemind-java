import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();
	    int t=sc.nextInt();
	    int r=sc.nextInt();
	    System.out.printf("%d",(r*p*t)/100);
    }
}