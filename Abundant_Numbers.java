import java.util.Scanner;
public class adm{
    public static void main(String[] agr){
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt(),sum=0,i=1;
        for(;i<n;i++)
            if(n%i==0) sum+=i;
        System.out.print(n<=sum?"True":"False");
    }
}