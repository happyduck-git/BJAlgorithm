import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 나이트의이동 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] count;

    public static void main(String[] args) throws IOException {
        int numOfTestCase = Integer.parseInt(br.readLine());

        while(numOfTestCase > 0) {
            numOfTestCase--;

            //matrix의 길이
            int n = Integer.parseInt(br.readLine());
            //시작점
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            //목표지점
            st = new StringTokenizer(br.readLine());
            int goalRow = Integer.parseInt(st.nextToken());
            int goalCol = Integer.parseInt(st.nextToken());
            //방향 arr

            /* logic */
            count = new int[n][n];
            bfs(n, row, col, goalRow, goalCol);

            System.out.println(count[goalRow][goalCol]);

        }

    }

    private static void bfs(int length, int row, int col, int goalRow, int goalCol) {
        if(row == goalRow && col == goalCol) return;
        //방문 확인용 arr
        boolean[][] visited = new boolean[length][length];
        //방문할 좌표 row, col 각각 저장할 queue 선언&생성
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        visited[row][col] = true;
        count[row][col] = 0;
        q1.add(row);
        q2.add(col);

        //방향 arr
        int[][] dir = {{1,2}, {1,-2}, {2,1}, {2,-1}, {-2,1}, {-2,-1}, {-1,2}, {-1,-2}};

        while(q1.size() != 0) {
            row = q1.poll();
            col = q2.poll();

            for(int i = 0; i < dir.length; i++) {

                int nr = row + dir[i][0];
                int nc = col + dir[i][1];


                if(nr == goalRow && nc == goalCol) {
                    visited[nr][nc] = true;
                    count[nr][nc] = count[row][col] + 1;
                    return;
                }

                if(nr >= 0 && nr < length && nc >= 0 && nc < length && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    count[nr][nc] = count[row][col] + 1;
                    q1.add(nr);
                    q2.add(nc);
                }

            }

        }
    }
}


























