import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 경로찾기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] matrix;
    static int[][] answer;
    public static void main(String[] args) throws IOException {

        /* n input */
        int n = Integer.parseInt(br.readLine());
        matrix = new int[n][n];
        answer = new int[n][n];

        /* matrix input */
        int temp = n;
        while(n > 0) {
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < temp; i++) {
                matrix[temp - n][i] = Integer.parseInt(st.nextToken());
            }
            n--;
        }

        /* logic */

        for(int i = 0; i < temp; i++) {
            for(int j = 0; j < temp; j++) {

            }
        }

        for(int i = 0; i < answer.length; i++) {
            System.out.println(Arrays.toString(answer[i]));
        }
    }

    private static int dfs(int startX, int startY, int target) {

        if(matrix[startX][startY] == 1 && (startX == startY || startX == target)) return 1;
        for(int i = 0; i < matrix[startX].length; i++) {
            if(matrix[startX][i] == 1) {
                dfs(i, startY, target);
            }
        }
        return 0;
    }


}



























