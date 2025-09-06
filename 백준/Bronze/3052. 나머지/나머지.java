import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]N = new int[10];
        int count = 0;

        for(int i = 0; i<10; i++) {
            N[i] = sc.nextInt() % 42;
        }

        for (int i = 0; i < 10; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (N[i] == N[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
