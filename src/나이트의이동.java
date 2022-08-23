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

        /* input */
        //test case
        int numOfTestCase = Integer.parseInt(br.readLine());

        //test case 만큼 반복
        while(numOfTestCase > 0) {
            numOfTestCase--; //escape을 위해 줄여주기

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

            /* logic */
            count = new int[n][n];
            bfs(n, row, col, goalRow, goalCol);

            System.out.println(count[goalRow][goalCol]);

        }

    }

    private static void bfs(int length, int row, int col, int goalRow, int goalCol) {
        //출발지점이랑 도착지점이 같으면 바로 return
        if(row == goalRow && col == goalCol) return;
        //방문 확인용 arr
        boolean[][] visited = new boolean[length][length];
        //방문할 좌표 row, col 각각 저장할 queue 선언&생성
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        //출발지점 방문 true로 변환
        visited[row][col] = true;
        //출발지점은 0부터 시작
        count[row][col] = 0;
        //Queue에 방문한 곳은 넣어주기
        q1.add(row);
        q2.add(col);

        //나이트가 이동가능한 방향 arr
        int[][] dir = {{1,2}, {1,-2}, {2,1}, {2,-1}, {-2,1}, {-2,-1}, {-1,2}, {-1,-2}};

        //bfs 탐색 시작
        while(q1.size() != 0) {
            row = q1.poll();
            col = q2.poll();

            //방문이 가능한 방향 모두 확인
            for(int i = 0; i < dir.length; i++) {

                //새로운 row, col 계산
                int nr = row + dir[i][0];
                int nc = col + dir[i][1];

                //새로운 지점이 목표지점과 같은 경우에는 count 올린 후 return
                if(nr == goalRow && nc == goalCol) {
                    visited[nr][nc] = true;
                    count[nr][nc] = count[row][col] + 1;
                    return;
                }

                //목표지점이 아닌 경우 (index 확인 필요)
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


























