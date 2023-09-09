import java.util.*;
public class Collatz{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int co=0,k,maxCo=0,maxNum=0;
        for(int i=n;i<=m;i++){
            k=i;co=0;
            while(k>1){
                if(k%2==0) k=(int)k/2;
                else k=3*k+1;
                co++;
            }
            if(co>maxCo){
                maxCo=co;
                maxNum=i;
            }
        }
        System.out.println(maxNum);
    }
}