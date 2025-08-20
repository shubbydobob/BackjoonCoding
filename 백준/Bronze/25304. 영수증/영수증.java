import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPrice = sc.nextInt();
        int quantity = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= quantity; i++) {
            int price = sc.nextInt();
            int count = sc.nextInt();
            sum += price * count;
        }
        if (sum == totalPrice) {
            System.out.println("Yes");
            sc.close();
        } else {
            System.out.println("No");
            sc.close();
        }
    }
}
