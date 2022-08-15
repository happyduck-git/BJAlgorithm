import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 로봇청소기 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int count = 0;
    static int[][] lefts;
    static int[][] backs;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int dir = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        lefts = new int[][]{
                {0,-1}, //n
                {-1,0}, //e
                {0,1}, //s
                {1,0} //w
        };

        backs = new int[][]{

                {1,0}, //n
                {0,-1}, //e
                {-1,0}, //s
                {0,1} //w

        };

        boolean[][] visited = new boolean[n][m];

        dfs(visited, matrix, r, c, dir);

        System.out.println(count);

    }

    private static void dfs(boolean[][] visited, int[][] matrix, int r, int c, int dir) {

        //현재 위치를 청소한다
        if(!visited[r][c]) {
            visited[r][c] = true;
            count++;
        }

        //현재 위치에서 현재 방향을 기준으로 왼쪽 방향부터 차례대로 탐색을 진행한다.
        //왼쪽 방향 좌표 구하기
        int nr = r + lefts[dir][0];
        int nc = c + lefts[dir][1];

        //좌표가 matrix의 범위를 넘지 않는지 확인
        if(nr >= 0 && nr < matrix.length && nc >= 0 && nc < matrix[0].length) {
            if((matrix[r][c-1] == 1 || visited[r][c-1]) && (matrix[r+1][c] == 1 || visited[r+1][c]) && (matrix[r][c+1] == 1 || visited[r][c+1]) && (matrix[r-1][c] == 1 || visited[r-1][c])) {
                //뒷 쪽이 1이면 return
                int backR = r + backs[dir][0];
                int backC = c + backs[dir][1];

                if(matrix[backR][backC] == 1) {
                    return;
                }

                //뒷 쪽이 0이면 후진 1칸
                dfs(visited, matrix, backR, backC, dir);
            } else {
                //왼쪽에 청소하지 않은 공간이 있으면
                if(matrix[nr][nc] == 0 && !visited[nr][nc]) {
                    dir = (dir+3)%4;
                    dfs(visited, matrix, nr, nc, dir);
                } else {
                    dir = (dir+3)%4;;
                    dfs(visited, matrix, r, c, dir);

                }
            }

        } else {
            dir = (dir+3)%4;;
            dfs(visited, matrix, r, c, dir);
        }



    }
}




















