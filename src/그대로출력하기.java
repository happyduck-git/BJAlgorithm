import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그대로출력하기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        String temp;
        /* input */
        while((temp = br.readLine()) != null) {
            sb.append(temp).append("\n");
        }

        System.out.println(sb);
    }

}
