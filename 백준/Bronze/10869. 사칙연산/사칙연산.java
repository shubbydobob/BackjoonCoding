import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        List<BiFunction<Integer, Integer, Integer>> operations = List.of(
                Integer::sum,
                (a, b) -> a - b,
                (a, b) -> a * b,
                (a, b) -> b != 0 ? a / b : 0,
                (a, b) -> b != 0 ? a % b : 0
        );
        operations.stream()
                .map(op -> op.apply(x, y))
                .forEach(System.out::println);
    }
}