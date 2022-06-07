import java.io.*;
import java.util.StringTokenizer;

public class 연결요소의개수 {
    static int[][] matrix;
    static boolean[] visited;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //num of vertices and num of edges
        st =  new StringTokenizer(br.readLine());
        int numOfVertices = Integer.parseInt(st.nextToken());
        int numOfEdges = Integer.parseInt(st.nextToken());

        //build a matrix
        matrix = new int[numOfVertices][numOfVertices];
        for(int i = 0; i < numOfEdges; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken()) - 1;
            int second = Integer.parseInt(st.nextToken()) - 1;
            matrix[first][second] = 1;
            matrix[second][first] = 1;
        }

        br.close();
        //boolean[] visited & int count
        visited = new boolean[numOfVertices];
        count = 0;
        for(int i = 0; i < numOfVertices; i++) {
            if(!visited[i]) {
                count += 1;
                dfs(i, visited, matrix);
            }
        }
        bw.write(count + "");
        bw.flush();
        bw.close();
    }

    public static void dfs(int from, boolean[] visited, int[][] matrix) {
        if(visited[from]) {return;}
        visited[from] = true;
        for(int i = 0; i < matrix[from].length; i++) {
            if(matrix[from][i] == 1) {
                dfs(i, visited, matrix);
            }
        }
    }
}
