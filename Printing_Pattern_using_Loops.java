import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int length = (n * 2) - 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int index = Math.abs(Math.min(Math.min(i, j), Math.min(length - 1 - i, length - 1 - j)));
                System.out.print(n - index+" ");
                if (index < n - 1) {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}