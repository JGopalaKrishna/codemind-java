import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
	    int q=a,r,i=1,s=0,king=1;
	    if(a%9!=0){
	    while(q!=0){
	        r=q%10;
	        if(r%6==0) king=i;
	        i*=10;
	        q=q/10;
	    }
	    king=king*3;
	    System.out.print(a+king);
	    }
	    else{
	        System.out.print(a);
	    }
    }
}