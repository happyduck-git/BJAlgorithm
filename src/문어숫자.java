import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class 문어숫자 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        //{'/', '-', '\\', '(', '@', '?', '>', '&', '%'}
        ArrayList<Character> arr = new ArrayList<>(
                Arrays.asList('/', '-', '\\', '(', '@', '?', '>', '&', '%')
        );

        while(true) {
            String input = br.readLine();

            //break statement
            if(input.charAt(0) == '#') break;

            int length = input.length();
            int answer = 0;

            for(int i = 0; i < input.length(); i++) {
                char a = input.charAt(i);
                int index = arr.indexOf(a) - 1;
                double powerOfEigth = Math.pow(8, (length - i - 1));
                answer += (int) powerOfEigth * index;
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);

    }
}
