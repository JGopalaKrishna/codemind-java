import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=21-(a+b);
	    if(c<=10 && c>=0) System.out.print(c);
	    else System.out.printf("-1");
    }
}