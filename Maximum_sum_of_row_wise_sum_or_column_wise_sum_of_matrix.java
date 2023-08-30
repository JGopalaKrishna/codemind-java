import java.util.*;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int rsum[]=new int[r];
        int csum[]=new int[c];
        int sum=0;
	    int arr[][]=new int[r][c];
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++)
		        arr[i][j]=sc.nextInt();
	    }
	    for(int i=0;i<r;i++){
	        sum=0;
	        for(int j=0;j<c;j++){
	            sum+=arr[i][j];
	        }
	        rsum[i]=sum;
	    }
	    for(int j=0;j<c;j++){
	        sum=0;
	        for(int i=0;i<r;i++){
	            sum+=arr[i][j];
	        }
	        csum[j]=sum;
	    }
	    Arrays.sort(rsum);
	    Arrays.sort(csum);
	    System.out.print(rsum[r-1]>csum[c-1] ? rsum[r-1]: csum[c-1]);
    }
}