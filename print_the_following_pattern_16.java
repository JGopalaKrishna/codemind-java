import java.util.Scanner;
public class qwe{
    public static void main(String[] awz){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(String.valueOf(i+" ").repeat(n));
        }
    }
}