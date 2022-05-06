import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //number of test cases
        int N = Integer.parseInt(br.readLine());
        //OX inputs
        int loop = N;
        while(true) {
            String input = br.readLine();
            loop -= 1;

            int count = 0;
            int answer = 0;
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == 'O') {
                    count += 1;
                } else {
                    count = 0;
                }
                answer += count;

            }
            System.out.println(answer);

            if(loop == 0) {
                break;
            }
        }


    }
}
