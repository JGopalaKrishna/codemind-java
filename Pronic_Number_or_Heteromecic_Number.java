import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
	    int q=a,r,s=0,i;
	    for(i=1;i<=a;i++){
	        q=a/i;
	        if(i+1==q){
	            s=1;
	            break;
	        }
	    }
	    System.out.printf(s==1?"YES":"NO");
    }
}