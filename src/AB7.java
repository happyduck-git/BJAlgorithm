import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AB7 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        int testCase = Integer.parseInt(br.readLine());
        int count = testCase;
        int a = 0;
        int b = 0;
        int sum = 0;

        while(count > 0) {

            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum = a + b;

            sb.append("Case #").append(testCase - count + 1).append(": ").append(a).append(" + ").append(b).append(" = ").append(sum).append("\n");
            count--;

        }

        System.out.println(sb);

    }

}
