import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FridgeOfYourDreams {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        int testCase = Integer.parseInt(br.readLine());

        while(testCase > 0) {
            testCase--;
            int sum = 0;
            int digit = 23;
            String temp = br.readLine();
            for(int i = 0; i < temp.length(); i++) {
                sum += calculator(temp.charAt(i) - '0', digit);
                digit--;
            }
            sb.append(sum + "\n");
        }

        System.out.println(sb);

    }

    public static int calculator(int num, int digit) {
        if(num == 1) {
            return (int) Math.pow(2, digit);
        }
        return 0;
    }
}
