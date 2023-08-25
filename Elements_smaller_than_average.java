import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
	    int arr[]=new int[a];
	    int sum=0;
	    for(int i=0;i<a;i++){
		arr[i]=sc.nextInt();
		sum+=arr[i];
	    }
        double av=(double)sum/a;
        int c=0;
        for(int j:arr){
            if(j<=av)c+=1;
        }
	    System.out.printf("%d",c);
    }
}