import java.util.*;
public class ee{
    public static void main(String[] aasd){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int div=sc.nextInt();
        int [] arr =new int[size];
        int co=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%div!=0) co++;
        }
        System.out.print(co);
    }
}