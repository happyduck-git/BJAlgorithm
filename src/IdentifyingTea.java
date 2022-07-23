import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IdentifyingTea {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        //input the correct tea
        String answer = br.readLine();

        //find out how many contestants are correct
        st = new StringTokenizer(br.readLine());
        int count = 0;
        while(st.hasMoreTokens()) {
            if(st.nextToken().equals(answer)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
