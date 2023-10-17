import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(j+i==n-1 || i==j)
	                System.out.printf("x");
	            else System.out.printf("0");
	        }
	        System.out.println();
	    }
	    
    }
}