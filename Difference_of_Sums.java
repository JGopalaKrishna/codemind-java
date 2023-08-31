import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
	    int sum=0,add=0;
	    for(int i=1;i<=a;i++){
		        sum+=i*i;
		        add+=i;
	    }
	    add=add*add;
	    System.out.printf("%d",add-sum);
    }
}