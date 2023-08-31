import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
	    int q,r,s=0;
	    while(a!=0 && a!=1 && a!=2 && a!=3 && a!=4 && a!=5 && a!=6 && a!=7 && a!=8 && a!=9){
	         q=a;
	        while(q!=0){
	            r=q%10;
	            s+=r;
	            q=q/10;
	        }
	        a=s;
	        s=0;
	    }
	    System.out.print(a);
    }
}