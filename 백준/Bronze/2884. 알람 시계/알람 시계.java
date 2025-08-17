import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        y -= 45;
        if (y < 0) {
            y += 60;
            x -= 1;
        }
        
        if (x < 0) {
            x += 24;
        }
        if (0 <= x && x <= 23 && 0 <= y && y <= 59) {
            System.out.println((x + " " + y ));
        }
    }
}