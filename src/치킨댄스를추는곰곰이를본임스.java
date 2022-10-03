import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 치킨댄스를추는곰곰이를본임스 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        /* chicken */
        int chicken = Integer.parseInt(br.readLine());

        /* coke & beer */
        st = new StringTokenizer(br.readLine());
        int coke = Integer.parseInt(st.nextToken());
        int beer = Integer.parseInt(st.nextToken());

        /* logic */
        System.out.println(numOfChicken(chicken, coke, beer));
    }

    private static int numOfChicken(int chicken, int coke, int beer) {
        int chiWithCoke = coke / 2;
        int total = chiWithCoke + beer;
        if(chicken > total) {
            return total;
        }
        return chicken;
    }
}
