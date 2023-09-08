import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
	    int q,r,s=0,num=a;
	    while(num>9){
	        q=num;s=0;
	        while(q!=0){
	            r=q%10;
	            s+=r*r;
	            q=q/10;
	        }
	        num=s;
	    }
	    System.out.printf(num==1 || num==7?"True":"False");
    }
}