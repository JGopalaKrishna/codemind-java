import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
	    int k=sc.nextInt();
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    int a=n-k;
	    int cost;
	    if(x>y) cost=a*y;
	    else cost=a*x;
	    System.out.print(cost+k*x);
    }
}