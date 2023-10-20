//UNIQUE MAXIMUM NUMBER
import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
	    int[] arr= new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int max=0;
	    for(int i=0;i<n;i++){
	        int co=0;
	        for(int j=0;j<n;j++){
	            if(arr[i]==arr[j]) co++;
	        }
	        if(co==1 && arr[i]>max) max=arr[i];
	    }
	    System.out.print(max!=0?max:"-1");
    }
}