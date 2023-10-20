import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
	    int[] arry= new int[n];
	    int co=0;
	    for(int i=0;i<n;i++){
	        arry[i]=sc.nextInt();
	        if(String.valueOf(arry[i]).length()%2==0)
	            co++;
	    }
	    System.out.print(co);
    }
}