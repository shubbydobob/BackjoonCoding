import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String S = sc.next().toUpperCase();
            System.out.println("" + S.charAt(0) + S.charAt(S.length() - 1));
        }

        sc.close();
    }
}