import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Alphabet = sc.next();

        for (char c ='a'; c <= 'z'; c++) {
            System.out.print(Alphabet.indexOf(c) + " ");
        }
        
        sc.close();
    }
}
