import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대공약수와최소공배수 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        sb.append(gcd(a,b)).append("\n").append(lcm(a, b));

        System.out.println(sb);

    }

    private static int gcd(int a, int b) {
        int temp = 0;
        if(a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        while(b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;

    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a,b);
    }

}
























