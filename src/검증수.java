import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 검증수 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = 0;
        int count = 0;
        for (int i = 0; i < 5; i++) {
            n = Integer.parseInt(st.nextToken());
            count += (n * n);
        }
        System.out.println(count % 10);
    }
}
