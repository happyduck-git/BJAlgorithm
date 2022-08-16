import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 도비의영어공부 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        while(true) {
            String input = br.readLine();
            char first = input.charAt(0);

            if(first == '#') break;

            String subStr = input.substring(2).toLowerCase();
            int dup = 0;
            for(int i = 0; i < subStr.length(); i++) {
                if(subStr.charAt(i) == first) dup++;
            }
            sb.append(first).append(" ").append(dup).append("\n");
        }
        System.out.println(sb);

    }
}
