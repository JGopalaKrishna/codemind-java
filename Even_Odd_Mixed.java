import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q,r,s,e=0,o=0;
        q=n;
        while(q!=0){
            r=q%10;
            if(r%2==0) e+=1;
            else o+=1;
            q=q/10;
        }
        if(e>0 && o>0) System.out.printf("Mixed");
	    else if(e>0 && o==0)System.out.printf("Even");
	    else System.out.printf("Odd");
    }
}