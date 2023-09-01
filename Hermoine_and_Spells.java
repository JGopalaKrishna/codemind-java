import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    if(a<b && a<c) System.out.print(b+c);
	    else if(b<a && b<c) System.out.print(a+c);
	    else System.out.print(b+a);
	    
    }
}