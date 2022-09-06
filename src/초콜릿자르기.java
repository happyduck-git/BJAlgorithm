import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 초콜릿자르기 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(n == 1 && m == 1) {
            System.out.println(0);
        } else if(n == 1) {
            System.out.println(m-1);
        } else if(m == 1) {
            System.out.println(n-1);
        } else {
            System.out.println((n-1) + (n * (m-1)));
        }

    }
}
