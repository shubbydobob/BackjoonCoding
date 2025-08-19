import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        y += z;
        if (y >= 60) {
            x += y / 60;
            y = y % 60;
        }
        if (x >= 24) {
            x = x % 24;
        }
        if (0 <= x && x <= 23 && 0 <= y && y <= 59) {
            System.out.println((x + " " + y ));
        }
    }
}