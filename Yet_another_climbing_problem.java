import java.util.Scanner;
public class climb{
    public static void main(String[] axw){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a/b;
            int d=a-c*b;
            System.out.println(c+d);
        }
    }
}