import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 영수증 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int totalAmount = Integer.parseInt(br.readLine());
        int amountOfProducts = Integer.parseInt(br.readLine());

        int sum = 0;
        while(amountOfProducts > 0) {
            amountOfProducts--;
            st = new StringTokenizer(br.readLine());
            sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        if(totalAmount == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}
