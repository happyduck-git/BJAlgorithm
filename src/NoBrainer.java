import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NoBrainer {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    public static void main(String[] args) throws IOException  {

        //number of test cases
        int t = Integer.parseInt(br.readLine());

        //get input for t times
        while(t > 0) {
            t--;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a-b >= 0) {
                sb.append("MMM BRAINS").append("\n");
            } else {
                sb.append("NO BRAINS").append("\n");
            }
        }
        System.out.println(sb);

    }
}
