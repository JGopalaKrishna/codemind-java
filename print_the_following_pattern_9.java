import java.util.Scanner;
public class as{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=1,spa=n-1;
	    for(int i=1;i<=n;i++){
	        System.out.print(" ".repeat(spa));
	        for(int j=0;j<k;j++){
	            System.out.print(i);
	        }
	        k+=2;
            spa--;
	        System.out.println("");
	    }
	    
    }
}