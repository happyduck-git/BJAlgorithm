import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N찍기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }
}
