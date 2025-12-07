import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String word = sc.nextLine();

        for (String c : croatia) {
            word = word.replace(c, "*");
        }

        System.out.println(word.length());

    }
}