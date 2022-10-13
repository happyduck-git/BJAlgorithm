import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASimpleProblem {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        /* input */
        int t = Integer.parseInt(br.readLine());
        long n = 0;
        while (t > 0) {
            t--;
            n = Long.parseLong(br.readLine());
            sb.append(n*n).append("\n");
        }

        System.out.println(sb);

    }

}
