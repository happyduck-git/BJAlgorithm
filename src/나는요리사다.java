import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나는요리사다 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        int max = 0;
        int index = 0;
        int temp = 0;
        for(int i = 1; i < 6; i++) {
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                temp += Integer.parseInt(st.nextToken());
                if(temp > max) {
                    max = temp;
                    index = i;
                }
            }
            temp = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(index).append(" ").append(max);

        System.out.println(sb);
    }
}
