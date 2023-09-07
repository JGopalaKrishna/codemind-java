import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
	    int q=a,r,max=0;
	    while(q!=0){
	        r=q%10;
	        if(max<r) max=r;
	        q=q/10;
	    }
	    System.out.print(max);
    }
}