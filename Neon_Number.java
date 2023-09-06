import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
	    int q=a*a,r,s=0;
	    while(q!=0){
	        r=q%10;
	        s+=r;
	        q=q/10;
	    }
	    System.out.printf(s==a?"Neon Number":"Not Neon Number");
    }
}