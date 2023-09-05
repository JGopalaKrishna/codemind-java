import java.util.Scanner;
public class hi{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        int w=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(w==x || w==y || w==z|| w==x+y || w==y+z || w==z+x || w==x+y+z)
            System.out.print("YES");
        else System.out.print("NO");
        
    }
}