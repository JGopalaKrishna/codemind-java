import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int[] ar=new int[a];
        int sum=0;
	    for(int i=0;i<a;i++){
	        ar[i]=sc.nextInt();
	        sum+=ar[i];
	    }
	    System.out.print(sum);
    }
}