import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
	    int[] arr= new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int flag=0;
	    for(int i=0;i<n;i++){
	        int co=0;
	        for(int j=0;j<n;j++){
	            if(arr[i]==arr[j])co++;
	        }
	        if(co==1){
	        System.out.print(arr[i]+" ");
	        flag=1;
	        }
	    }
	    if(flag==0) System.out.print(-1);
    }
}