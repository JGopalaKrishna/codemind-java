import java.util.*;
public class excelSheet {

   static void methodOd(int a){
        int num=a,q,r;
        q=num/26;
        if(q>26) methodOd(q);
        else System.out.printf("%c",q+64);
        r=num%26; if(r==0) r+=1;
        System.out.printf("%c",r+64);
   }

   static void methodEv(int b){
        int num=b,q;
        q=num/26;
        q=q-1;
        if(q>26) methodOd(q);
        else System.out.printf("%c",q+64);        
   }
    public static void main(String[] awx){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=26) System.out.printf("%c",n+64);
        else if(n%26!=0){
            methodOd(n);
        }else{
            methodEv(n);
            System.out.printf("Z");
        }
    sc.close();
    }
}