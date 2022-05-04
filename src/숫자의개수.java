import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        br.close();
        int count = 0;
        String multiply = String.valueOf(A * B * C);

        for(int n = 0; n < 10; n++) {
            for(int i = 0; i < multiply.length(); i++) {
                if(multiply.charAt(i) - '0' == n) {
                    count += 1;
                }

            }
            System.out.println(count);
            count = 0;
        }
    }
}
