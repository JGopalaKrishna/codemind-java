import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
	    int b=sc.nextInt();
	    int i,q,r,x=0,y=0;
	    for(i=a;i<=b;i++){
	        q=i;
	        x=0;
	        if(i%10!=0){
	        while(q!=0){
	            r=q%10;
	            if(i%r!=0) x+=1;
	            q=q/10;
	        }
	        if(x==0) System.out.printf("%d ",i);
	        }
	    }
	    
    }
}