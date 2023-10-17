import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
	    for(int i=0;i<n;i++){
	       for(int j=0;j<=i;j++){
	            if(j==0 || j==i || i==n-1)
	                System.out.printf("*");
	            else System.out.printf(" ");
	        }
	        System.out.println();
	    }
	    
    }
}