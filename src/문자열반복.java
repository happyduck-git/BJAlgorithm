import java.io.*;
import java.util.StringTokenizer;

public class 문자열반복 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            bw.write(repeat(str, n) + "\n");

        }
        br.close();
        bw.flush();
        bw.close();
    }
    private static String repeat(String str, int repeat) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < repeat; j++) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
