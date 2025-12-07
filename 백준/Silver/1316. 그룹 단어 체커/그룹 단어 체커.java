import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i< N; i++) {
            String words = br.readLine().toLowerCase();

            if(isGroupWord(words)) {
                cnt++;
            }
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
    }

    private static boolean isGroupWord(String words) {
        boolean[] visited = new boolean[26];
        char prev = 0;

        for(int i =0; i < words.length(); i++) {
            char cur = words.charAt(i);
            if(cur != prev) {
                if(visited[cur - 'a']) {
                    return false;
                }
                visited[cur - 'a'] = true;
            }
            prev = cur;
        }
        return true;
    }
}