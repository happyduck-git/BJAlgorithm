import java.io.*;
import java.util.StringTokenizer;
/*
    1001번
    A-B
 */
public class AB2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        br.close();
        bw.write((Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken())) + "");
        bw.flush();
        bw.close();
    }
}
