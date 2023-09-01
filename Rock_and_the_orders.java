import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int d=sc.nextInt();
	    int co=sc.nextInt();
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    int z=sc.nextInt();
	    int i=a+b+c;
	    int j=x+y+z;
	    int de=2*d;
	    int ap=0;
	    if(i>=150 && j>=150 ){
	        if((co+i+j)<(de+i+j)) ap=1;
	    } 
	    else if(i>=150){
	        if((co+i+d+j)<(de+i+j)) ap=1;
	    }  
	    else if(j>=150){
	        if((co+j+d+i)<(de+i+j)) ap=1;
	    }
	    if(ap!=0) System.out.printf("YES");
	    else System.out.printf("NO");
    }
}