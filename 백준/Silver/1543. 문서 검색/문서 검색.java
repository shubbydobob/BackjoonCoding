import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        int count = 0;
        int startIndex = 0;

        while (true) {
            int index = doc.indexOf(word, startIndex);
            if (index == -1) {
                break;
            }
            count++;
            startIndex = index + word.length();
        }
        System.out.println(count);;
    }
}