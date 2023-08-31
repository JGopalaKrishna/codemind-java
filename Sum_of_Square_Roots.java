import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
	    int b=sc.nextInt();
	    double d=0;
	    for(int i=a;i<=b;i++){
		    d+=(double)Math.sqrt(i);
	    }
	    System.out.printf("%.2f",d);
    }
}