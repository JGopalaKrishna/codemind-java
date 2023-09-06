import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        double p,r,t,ci;
        p=sc.nextDouble();
	    r=sc.nextDouble();
	    t=sc.nextDouble();
	    ci=p*(Math.pow((1+(r/100)),t));
	    System.out.printf("%.2f",ci);
    }
}