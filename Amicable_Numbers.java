import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
	    int b=sc.nextInt();
	    int fs=0,ss=0;
	    for(int i=1;i<a;i++)
	        if(a%i==0)fs+=i;
	    for(int i=1;i<b;i++)
	        if(b%i==0)ss+=i;
	    System.out.printf(fs==b&&ss==a?"Amicable":"Not Amicable");
    }
}