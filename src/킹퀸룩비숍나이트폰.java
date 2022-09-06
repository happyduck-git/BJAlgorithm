import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 킹퀸룩비숍나이트폰 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        /*각 말의 개수*/
        int[] pieces = {1, 1, 2, 2, 2, 8};

        /* input */
        st = new StringTokenizer(br.readLine());

        /* logic */
        for(int i = 0; i < 6; i++) {
            int piece = Integer.parseInt(st.nextToken());
            if(pieces[i] > piece) sb.append(pieces[i] - piece).append(" ");
            else if(pieces[i] < piece) sb.append("-").append(piece - pieces[i]).append(" ");
            else sb.append("0").append(" ");
        }

        System.out.println(sb);

    }
}
