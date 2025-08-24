import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringBuilder stars = new StringBuilder();

        for (int i = 0; i < T; i++) {
            stars.append("*");
            String line = String.format("%" + T + "s", stars.toString());
            sb.append(line).append('\n');
        }

        bw.write(sb.toString()); 
        bw.flush();
    }
}