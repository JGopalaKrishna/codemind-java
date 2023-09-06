import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
	    for(int i=1;i<a;i++){
	        if(a%i==0) sum+=i;
	    }
	    System.out.printf(a==sum?"True":"False");
    }
}