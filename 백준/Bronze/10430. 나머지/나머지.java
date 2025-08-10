import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

           int[] results = computedModIdentities(A, B, C);
           StringBuilder sb = new StringBuilder();
           for (int r: results) sb.append(r).append('\n');
           System.out.print(sb);
        }
    }

    static int[] computedModIdentities(int A, int B, int C){
        int aMod = A % C;
        int bMod = B % C;

        int r1 = (A + B) % C;
        int r2 = (aMod + bMod) % C;
        int r3 = (A * B) % C;
        int r4 = (aMod * bMod) % C;

        return new int[] {r1, r2, r3, r4};
    }
}