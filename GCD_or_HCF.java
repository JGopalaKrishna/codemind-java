import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=0;
	    for(int i=1;i<a+b;i++){
	        if(a/i==0 || b/i==0) break;
	        if(a%i==0 && b%i==0)
	            if(i>max) max=i;
	    }
	    System.out.printf("%d",max);
    }
}