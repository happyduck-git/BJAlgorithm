import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 열개씩끊어출력하기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        String input = br.readLine();
        int start = 0;
        int end = 10;



        while(end < input.length()) {
            sb.append(input.substring(start, end)).append("\n");
            start = end;
            end += 10;
        }

        sb.append(input.substring(start, input.length()));

        System.out.println(sb);

    }

}
