import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 배열미사용최소최대 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //첫번째 입력 처리
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        //두번째 입력 처리 & min, max 구하기
        st = new StringTokenizer(br.readLine());
        int max = -1000001;
        int min = 1000000;
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        System.out.println(min + " " + max);
    }
}

