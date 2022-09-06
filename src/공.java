import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 공 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        int numOfMove = Integer.parseInt(br.readLine());
        int[] cups = {1, 2, 3};
        int a;
        int b;

        while(numOfMove > 0) {
            numOfMove--;
            st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            cups[a-1] = b;
            cups[b-1] = a;
        }
        System.out.println(cups[0]);
    }
}
