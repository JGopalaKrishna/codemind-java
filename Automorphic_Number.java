import java.util.*;
public class test{
    public static void main(String[] ahge){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int s=n*n;
        String s1=Integer.toString(n);
        String s2=Integer.toString(s);
        System.out.print(s2.endsWith(s1)?"Automorphic Number" : "Not an Automorphic Number");
    }
}