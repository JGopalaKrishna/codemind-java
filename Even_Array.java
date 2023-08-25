import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
	    int arr[]=new int[a];
	    for(int i=0;i<a;i++){
		arr[i]=sc.nextInt();
	    }
	    int c=0;
		for(int j=0;j<a;j++){
	            if(arr[j]%2==0){
	                c+=1;
	            }
        }
	    System.out.printf(c==a?"True":"False");
    }
}