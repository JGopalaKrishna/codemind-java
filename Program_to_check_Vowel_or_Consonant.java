import java.util.Scanner;
public class test{
    public static void main(String[] ahrs){
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
	    String vowels="aeiouAEIOU";
	    if(vowels.contains(String.valueOf(ch)))
	    System.out.printf("Vowel");
	    else System.out.printf("Consonant");
    }
}