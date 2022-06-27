import java.io.*;
import java.util.StringTokenizer;

public class AB4 {
    /*
    10998번
    AxB
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        br.close();
        bw.write(a*b +"");
        bw.flush();
        bw.close();

    }
}
