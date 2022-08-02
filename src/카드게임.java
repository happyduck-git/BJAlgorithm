import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 카드게임 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        System.out.println(sum);


    }
}
