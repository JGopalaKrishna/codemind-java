import java.util.*;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
	    int[] arr= new int[n];
	    int[] brr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	        brr[i]=arr[i]*arr[i];
	    }
	    Arrays.sort(brr);
	    for(int i:brr)
	    System.out.printf("%d ",i);
    }
}