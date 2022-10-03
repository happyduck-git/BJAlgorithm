import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/* 왜 StringBuilder로 하면 안될까? */
public class 숫자판점프 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Set<String> answers = new HashSet<>();
    static int[][] dir = {{0,-1}, {0,1}, {1,0}, {-1,0}};
    public static void main(String[] args) throws IOException {

        /* matrix input */
        int[][] matrix = new int[5][5];

        for(int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        /* logic */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {

                finder(matrix, i, j, new StringBuilder().append(matrix[i][j]), 0);
            }
        }

        System.out.println(answers.size());

    }

    private static void finder(int[][] matrix, int row, int column, StringBuilder sb, int count) {
        int nr = 0;
        int nc = 0;

        for(int d = 0; d < dir.length; d++) {
            nr = row + dir[d][0];
            nc = column + dir[d][1];
            if(nr < 0 || nr >= 5 || nc < 0 || nc >=5) {
                continue;
            } else {
                if(count == 5) {
                    answers.add(sb.toString());
                    break;
                }

                finder(matrix, nr, nc, sb.append(matrix[nr][nc]), count+1);
            }
        }

    }
}





























