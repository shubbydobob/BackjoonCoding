import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] exist = new boolean[1000001];

        for (int i = 0; i < N; i++) {
            int checked = sc.nextInt();
            exist[checked] = true;
        }

        int X = sc.nextInt();
        int ans = 0;

        for (int i = 1; i < X; i++) {
            int target = X - i;
            if (target > 1000000) continue;

            if (i < target && exist[i] && exist[target]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}