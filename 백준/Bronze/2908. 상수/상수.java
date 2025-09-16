import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String A = new StringBuilder(a).reverse().toString();
        String B = new StringBuilder(b).reverse().toString();

        int numA = Integer.parseInt(A);
        int numB = Integer.parseInt(B);

        System.out.println(Math.max(numA, numB));

        sc.close();
    }
}