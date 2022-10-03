import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주사위게임 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        /* input1 */
        int n = Integer.parseInt(br.readLine());
        /* input2 */
        int max = 0;
        int temp = 0;
        while(n > 0) {
            n--;

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt((st.nextToken()));
            int b = Integer.parseInt((st.nextToken()));
            int c = Integer.parseInt((st.nextToken()));

            /* logic */
            temp = prizeCalculator(a, b, c);
            if(temp > max) {
                max = temp;
            }
        }
        System.out.println(max);
    }

    private static int prizeCalculator(int a, int b, int c) {
        int max = 0;
        //three nums are the same
        if(a == b && b == c) {
            return (10000 + (a * 1000));
        } else if(a == b || a == c) {
            return (1000 + (a * 100));
        } else if(b == c) {
            return (1000 + (b * 100));
        } else {
            return findMax(a, b, c, max) * 100;
        }
    }

    private static int findMax(int a, int b, int c, int max) {
        if(a > max) max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        return max;
    }
}



























