import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=a%10;
	    if(b==0){
	        System.out.print((int)a/10);
	    }
	    else if(b%5==0){
	        System.out.print((int)(a/10+b/5));
	    }else
	    System.out.printf("-1");
    }
}