import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 그림 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    static int maxWidth = 0;
    static int numberOfDrawings = 0;
    static int count = 0;
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        /* n & m input */
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        /* matrix input */
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        boolean[][] visited = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {

                dfs(matrix, i, j, visited);
                arrayList.add(count);
                count = 0;

            }
        }
        for(int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) > maxWidth) {
                maxWidth = arrayList.get(i);
            }
            if(arrayList.get(i) > 0) {
                numberOfDrawings++;
            }
        }
        System.out.println(numberOfDrawings);
        System.out.println(maxWidth);

    }

    private static void dfs(int[][] matrix, int curR, int curC, boolean[][] visited) {
        //방문여부 확인
        if(visited[curR][curC] || matrix[curR][curC] == 0) return;

        //방문한 적 없으면 탐색
        visited[curR][curC] = true;
        count++;

        for(int i = 0; i < dir.length; i++) {

            int nr = curR + dir[i][0];
            int nc = curC + dir[i][1];

            if(nr < 0 || nr >= matrix.length || nc < 0 || nc >= matrix[0].length) {
                continue;
            } else {
                dfs(matrix, nr, nc, visited);
            }
        }

    }

}
