import java.util.Scanner;
public class Main{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        float a=sc.nextInt();
	    float b=sc.nextInt();
	    float c=sc.nextInt();
	    float d=(a/(b*c));
		double e=Math.ceil(d);
	    System.out.println((int)e);
    }
}