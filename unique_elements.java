import java.util.*;
//first logic advanced- arrays-unique elements
public class test{
    public static void main(String[] aga){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            c=0;
            for(int j=0;j<i;j++){
                if(ar[i]==ar[j]){
                    c=1;
                }
            }
            if(c==0) System.out.printf("%d ",ar[i]);
        }
    }
}