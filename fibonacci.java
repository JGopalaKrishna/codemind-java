import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
	    int a=0,b=1,co=0,a1=0;
	    System.out.print(a+" "+b+" ");
	    while(co!=n-2){
	        a1=b;
	        b=a+b;
	        a=a1;
	        System.out.print(b+" ");
	        co++;
	    }
    }
}