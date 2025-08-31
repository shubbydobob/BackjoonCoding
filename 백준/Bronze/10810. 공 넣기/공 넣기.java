import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();
       int M = sc.nextInt();

       int [] basket = new int[N +1];

       for (int a = 0; a < M; a++) {
           int i = sc.nextInt();
           int j = sc.nextInt();
           int k = sc.nextInt();

           for (int b = i; b <= j; b++) {
               basket[b] = k;
           }
       }

       for (int x = 1; x <= N; x++) {
           System.out.print(basket[x] + " ");
       }

        sc.close();
    }
}