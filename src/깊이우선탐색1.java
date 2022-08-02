import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
ArrayList로 사용해보기!
 */
public class 깊이우선탐색1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] answer;
    static int order = 0;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int vertices = Integer.parseInt(st.nextToken());
        int edges = Integer.parseInt(st.nextToken());
        int startVertex = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[vertices][vertices];

        for(int i = 0; i < edges; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken()) - 1;
            int to = Integer.parseInt(st.nextToken()) - 1;
            matrix[from][to] = 1;
            matrix[to][from] = 1;
        }

        boolean[] visited = new boolean[vertices];

        answer = new int[vertices];

        dfs(matrix, startVertex-1, visited);

        for(int i : answer) {
            System.out.println(i);
        }
    }

    private static void dfs(int[][] matrix, int start, boolean[] visited) {
        if(visited[start]) return;

        visited[start] = true;
        order++;
        answer[start] = order;

        for(int i = 0; i < matrix[start].length; i++) {
            if(matrix[start][i] == 1 && !visited[i]) {
                dfs(matrix, i, visited);
            }
        }

    }
}

