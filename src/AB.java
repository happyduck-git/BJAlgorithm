import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//내 풀이-통과
public class AB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean shouldContinue = true;
        while (shouldContinue){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A == 0 && B == 0){
                shouldContinue = false;
                br.close();
            } else {
                System.out.println(A+B);
            }

        }
    }
}
