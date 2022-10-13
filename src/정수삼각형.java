import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정수삼각형 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] matrix;
    public static void main(String[] args) throws IOException {

        /* input */
        int n = Integer.parseInt(br.readLine());
        matrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            int index = 0;
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                matrix[i][index] = Integer.parseInt(st.nextToken());
                index++;
            }
        }

        /* logic */
        for(int i = n-2; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                matrix[i][j] = Math.max(matrix[i+1][j], matrix[i+1][j+1]) + matrix[i][j];
            }
        }

        System.out.println(matrix[0][0]);

    }
}
