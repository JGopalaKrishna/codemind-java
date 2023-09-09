import java.util.Scanner;
public class pretty{
    public static void main(String[] awq){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int co=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            for(int j=a;j<=b;j++){
                int r=j%10;
                if(r==2||r==3||r==9) 
                    co+=1;
            }
            System.out.println(co);
        }
    }
}