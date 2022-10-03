import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 벽부수고이동하기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    public static void main(String[] args) throws IOException {

        /* n&m input */
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        /* matrix */
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            for(int j = 0; j < m; j++) {
                matrix[i][j] = input.charAt(j) - '0';
            }
        }

        /* logic */
        bfs(matrix, n-1, m-1);

    }

    private static void bfs(int[][] matrix, int endX, int endY) {

        Queue<int[]> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[matrix.length][matrix[0].length][2];

        /* (0,0) 방문 체크 */
        queue.add(new int[]{0,0,1,1});
        visited[0][0][1] = true;
        int answer = -1;

        /* logic */

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];
            int count = current[2];

            //exit 하는 곳에 다다른 경우
            if(currentX == endX && currentY == endY) {
                answer = current[3];
                break;
            }

            //아직 exit 장소가 아닌 경우
            for(int i = 0; i < dir.length; i++) {
                int newX = currentX + dir[i][0];
                int newY = currentY + dir[i][1];

                if(newX < 0 || newX > endX || newY < 0 || newY > endY) {
                    continue;
                } else {
                    /* 방문한적 없고, 벽이고, 한 번 부술 수 있는 경우 */
                    if(count > 0 && !visited[newX][newY][count-1] && matrix[newX][newY] == 1) {
                        visited[newX][newY][count-1] = true;
                        queue.add(new int[]{newX, newY, count-1, current[3] + 1});
                    }

                    /* 방문한 적 없고, 통로인 경우 */
                    if(!visited[newX][newY][count] && matrix[newX][newY] == 0) {
                        visited[newX][newY][count] = true;
                        queue.add(new int[]{newX, newY, count, current[3] + 1});
                    }
                }
            }

        }
        System.out.println(answer);

    }

}



























