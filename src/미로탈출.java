import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탈출 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    public static void main(String[] args) throws IOException {

        /* size of the maze */
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        /* starting point */
        st = new StringTokenizer(br.readLine());
        int hx = Integer.parseInt(st.nextToken()) - 1;
        int hy = Integer.parseInt(st.nextToken()) - 1;

        /* escaping point */
        st = new StringTokenizer(br.readLine());
        int ex = Integer.parseInt(st.nextToken()) - 1;
        int ey = Integer.parseInt(st.nextToken()) - 1;

        /* matrix */
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs(matrix, hx, hy, ex, ey);
    }

    private static void bfs(int[][] matrix, int hx, int hy, int ex, int ey) {

        Queue<int[]> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[matrix.length][matrix[0].length][2];
        queue.add(new int[]{hx, hy, 1, 0});
        visited[hx][hy][1] = true;
        int answer = -1;

        while(!queue.isEmpty()) {
            int cur[] = queue.poll();
            int curR = cur[0];
            int curC = cur[1];
            int cnt = cur[2];

            /* exit인 경우 */
            if(curR == ex && curC == ey) {
                answer = cur[3];
                break;
            }

            /* exit이 아닌 경우 */
            for(int i = 0; i < dir.length; i++) {
                int nr = curR + dir[i][0];
                int nc = curC + dir[i][1];

                //탐색이 가능한 범위를 넘는 경우
                if (nr < 0 || nr >= matrix.length || nc < 0 || nc >= matrix[0].length) {
                    continue;
                }

                //아직 막대기를 사용하지 않았고, 방문하지 않았으며, 벽인 경우
                if(cnt > 0 && !visited[nr][nc][cnt-1] && matrix[nr][nc] == 1) {
                    visited[nr][nc][cnt-1] = true;
                    queue.add(new int[]{nr, nc, cnt-1, cur[3]+1});
                }

                //아직 방문하지 않았고, 통로인 경우
                if(!visited[nr][nc][cnt] && matrix[nr][nc] == 0) {
                    visited[nr][nc][cnt] = true;
                    queue.add(new int[]{nr, nc, cnt, cur[3] + 1});

                }
            }
        }
        System.out.println(answer);

    }

}





























