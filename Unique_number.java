import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
	    String ns = Integer.toString(n);
	    char[] ach= ns.toCharArray();
	    for(int i=0;i<ach.length;i++)
	        for(int j=i+1;j<ach.length;j++)
	            if(ach[i]==ach[j]) 
	                count=1;
	    System.out.printf(count==1?"Not Unique Number":"Unique Number");
    }
}