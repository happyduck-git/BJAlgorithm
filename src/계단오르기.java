import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단오르기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        int[] stairs = new int[n+1];
        int[] memo = new int[n+1];

        for(int i = 1; i <= n; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        memo[1] = stairs[1];

        if(n > 1) {
            memo[2] = memo[1] + stairs[2];
        }

        for(int i = 3; i <= n; i++) {
            memo[i] = Math.max(stairs[i] + memo[i-2], stairs[i] + stairs[i-1] + memo[i-3]);
        }

        System.out.println(memo[n]);

    }
}
