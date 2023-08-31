import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
	    int q,r,s=0,p=1;
	    q=a;
	    while(q!=0){
	        r=q%10;
	        p*=r;
	        s+=r;
	        q=q/10;
	    }
	    System.out.printf("%d",p-s);
    }
}