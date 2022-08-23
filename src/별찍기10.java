import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기10 {
    static char[][] arr;
    public static void main(String[] args) throws IOException {

        /* input */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //정답을 담을 char type 2d arr 생성
        arr = new char[N][N];

        /* logic */
        star(0, 0, N, false);

        /* 출력 */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }


    static void star(int x, int y, int N, boolean blank) {

        // blank == true 인 경우에는 공백
        if (blank) {
            for (int i = x; i < x + N; i++) {
                for (int j = y; j < y + N; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        // N == 1인 경우(더 이상 쪼갤 수 없는 경우)는 *로 채우기
        if (N == 1) {
            arr[x][y] = '*';
            return;
        }


        int size = N / 3;
        int count = 0;
        for (int i = x; i < x + N; i += size) {
            for (int j = y; j < y + N; j += size) {
                count++;
                if (count == 5) { // 공백 칸일 경우 (1~4 번째까지는 무늬가 들어가고 5일 때 공백이 들어간다.
                    star(i, j, size, true);
                } else { //크기를 줄여가면서 재귀 시행
                    star(i, j, size, false);
                }
            }
        }
    }
}