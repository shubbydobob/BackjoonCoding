import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            basket[i] = i;
        }

        for (int m = 0; m < M; m++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            while (i < j) {
                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;
                i++;
                j--;
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.println(basket[i] + "");
        }
        sc.close();
    }
}