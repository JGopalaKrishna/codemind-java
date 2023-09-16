import java.util.Scanner;
public class test{
    static boolean prime(int q1){
    for(int i=2;i<q1;i++){     
        if(q1%i==0){
            return false;
        }
            
    }
    return true;
}

static boolean palin(int q2){
    int qu=q2,r,pa=0;
    while(qu!=0){
        r=qu%10;
        pa=pa*10+r;
        qu=qu/10;
    }
    if(q2==pa) return true;
    else return false;
}
    public static void main(String[] asw){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int suc=0,q=n+1;
        while(suc!=1){
            if(prime(q)){
                if(palin(q)){
                    System.out.print(q);
                    suc=1;
                }
            }
            q+=1;
        }
    }
}