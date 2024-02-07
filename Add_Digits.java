import java.util.*;
public class Main{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int sum=0;
while(n1>0)
	{
	int r=n1%10;
	sum=sum+r;
	n1=n1/10;
	if(n1==0){
      n1=sum;
      sum=0;
      if(n1<9)
      break;
  }
}
System.out.print(n1);
}
}