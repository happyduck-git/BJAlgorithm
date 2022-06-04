import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS와BFS {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {

        //1st line input
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int numOfEdges = Integer.parseInt(st.nextToken());
        int startVertex = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[size][size];

        for(int a = 0; a < numOfEdges; a++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            matrix[from - 1][to - 1] = 1;
            matrix[to - 1][from - 1] = 1;
        }

        dfs(startVertex - 1,matrix);
        bw.flush();
        System.out.println();
        bfs(startVertex - 1,matrix);
        bw2.flush();
        br.close();
        bw.close();
        bw2.close();


    }


    public static void dfs(int from, int[][] matrix) throws IOException {
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(from, visited, matrix);
    }

    private static void dFSHelper(int from, boolean[] visited, int[][] matrix) throws IOException {
        if(visited[from]) { return; }
        visited[from] = true;
        bw.write((from + 1) +" ");

        for(int i = 0; i < matrix[from].length; i++) {
            if(matrix[from][i] == 1) {
                dFSHelper(i, visited, matrix);
            }
        }
    }

    public static void bfs(int from, int[][] matrix) throws IOException{
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(from);
        visited[from] = true;

        while(queue.size() != 0) {
            int current = queue.poll();
            bw.write((current + 1) + " ");
            for(int i = 0; i < matrix[current].length; i++) {
                if(matrix[current][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }



}
