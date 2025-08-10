import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int year = sc.nextInt();
        int diff = 543;

        String changeYear = String.valueOf(year - diff);


        System.out.println(changeYear);

    }
}