import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
	    int sq=a*a,q=a,q1=sq,r=0,s,i=0;
	    double d=0;
	    while(q!=0){
	        r=q1%10;
	        d+=r*Math.pow(10,i);
	        i+=1;
	        q1=q1/10;
	        q=q/10;
	    }
	    System.out.printf(a==(int)d ? "Automorphic Number":"Not an Automorphic Number");
    }
}