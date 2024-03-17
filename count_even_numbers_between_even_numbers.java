import java.util.*;
public class cls{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int cou=0;
        for(int i=1;i<size-1;i++){
            if(arr[i-1]%2==0 && arr[i+1]%2==0){
                if(arr[i]%2==0) cou++;
            }
        }
        System.out.println(cou);
    }
}