import java.io.*;
import java.util.StringTokenizer;

public class 달팽이는올라가고싶다 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        //공백으로 나누기
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        //comp <= 0이 될 때까지 계산 진행, count로 횟수 세기
        int comp = v;
        int temp = 0;
        int count = 0;
        while (comp > 0) {
            int minus = 0;
            temp += a;
            minus += a;
            if (temp < v) {
                temp -= b;
                minus -= b;
            }
            comp -= minus;
            count += 1;
        }
        System.out.println(count);
    }
}


