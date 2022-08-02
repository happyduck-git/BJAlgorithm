import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 럭비클럽 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        while(true) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if(name.equals("#")) break;


            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            if(age > 17 || weight >= 80) sb.append(name).append(" Senior").append("\n");
            else sb.append(name).append(" Junior").append("\n");
        }

        System.out.println(sb);
    }
}
