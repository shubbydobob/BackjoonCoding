import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

       if (x == y && y == z) {
            System.out.println(10000 + x * 1000);
        } else if (x == y || y == z || x == z) {
            System.out.println(1000 + (x == y ? x : (z)) * 100);
        } else {
            System.out.println(Math.max(x, Math.max(y, z)) * 100);
        }

        sc.close();
    }
}