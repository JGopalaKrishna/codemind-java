import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
	    int a=0,b=1,c=0,a1=0;
	    while(a<=n){
	       if(a==n) c=1;
	       a1=b;
	       b=a+b;
	       a=a1;  
	    }
	    System.out.printf(c==1?"True":"False");
    }
}