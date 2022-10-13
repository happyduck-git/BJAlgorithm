import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 시간초과 */
public class 내려가기 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] matrix;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        /* input1 */
        int n = Integer.parseInt(br.readLine());
        /* input2 */
        matrix = new int[n][3];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        /* logic */

        for(int i = 0; i < n; i++) {

        }

        int max = Math.max(Math.max(goDownMax(n-1,0), goDownMax(n-1, 1)), goDownMax(n-1, 2));
        int min = Math.min(Math.min(goDownMin(n-1,0), goDownMin(n-1, 1)), goDownMin(n-1, 2));

        sb.append(max).append(" ").append(min);
        System.out.println(sb);
    }

    private static int goDownMin(int startX, int startY) {
        if(startX != 0) {
            if(startY == 0) return Math.min(goDownMin(startX - 1, startY), goDownMin(startX - 1, startY + 1)) + matrix[startX][startY];
            else if(startY == 1) return Math.min(Math.min(goDownMin(startX - 1, startY - 1), goDownMin(startX - 1, startY)), goDownMin(startX - 1, startY + 1)) + matrix[startX][startY];
            else return Math.min(goDownMin(startX - 1, startY - 1), goDownMin(startX - 1, startY)) + matrix[startX][startY];
        }
        return matrix[startX][startY];
    }

    private static int goDownMax(int startX, int startY) {
        if(startX != 0) {
            if(startY == 0) return Math.max(goDownMax(startX - 1, startY), goDownMax(startX - 1, startY + 1)) + matrix[startX][startY];
            else if(startY == 1) return Math.max(Math.max(goDownMax(startX - 1, startY - 1), goDownMax(startX - 1, startY)),  goDownMax(startX - 1, startY + 1)) + matrix[startX][startY];
            else return Math.max(goDownMax(startX - 1, startY - 1), goDownMax(startX - 1, startY)) + matrix[startX][startY];
        }
        return matrix[startX][startY];
    }
}
