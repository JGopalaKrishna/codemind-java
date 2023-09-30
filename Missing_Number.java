import java.util.*;
public class mte{
    public static void main(String[] asd){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size-1];
        for(int i=0;i<size-1;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int j=1,flag=0;
        for(int k:arr){
            if(k!=j){
                System.out.print(j);
                flag=1;
                break;
            }
            j++;
        }
        if(flag==0) System.out.print(j);
    }
}