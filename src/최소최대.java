import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소최대 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //첫번째 입력 처리
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        //두번째 입력 처리
        st = new StringTokenizer(br.readLine());
        long[] S = new long[N];
        for (int i = 0; i < N; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }
        //max & min 구하기
        long max = S[0];
        long min = S[0];
        for (int i = 1; i < N; i++) {

            if (S[i] > max) {
                max = S[i];
            }

            if (S[i] < min) {
                min = S[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
