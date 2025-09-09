import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] M = new int[N];

        for (int i = 0; i < N; i++) {
            M[i] = sc.nextInt();
        }
        double max = M[0];

        for (int i = 1; i < N; i++) {
            if (M[i] > max) {
                max = M[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (M[i] / max) * 100;
        }

        System.out.println(sum / N);

        sc.close();
    }
}
