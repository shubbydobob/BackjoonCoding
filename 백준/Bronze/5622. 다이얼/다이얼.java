import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String input = sc.nextLine();

        int time = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if ('A' <= c && c <= 'C') time += 3;
            else if ('D' <= c && c <= 'F') time += 4;
            else if ('G' <= c && c <= 'I') time += 5;
            else if ('J' <= c && c <= 'L') time += 6;
            else if ('M' <= c && c <= 'O') time += 7;
            else if ('P' <= c && c <= 'S') time += 8;
            else if ('T' <= c && c <= 'V') time += 9;
            else if ('W' <= c && c <= 'Z') time += 10;
        }

        System.out.println(time);
        sc.close();
    }
}

