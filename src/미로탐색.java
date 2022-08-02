import java.io.*;
import java.util.*;

//최단거리, 경로 문제는 BFS로 먼저 접근하기!

public class 미로탐색 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int[][] matrix;
    static boolean[][] visited;
    static int[][] count;
    static int[][] direction = {{-1,0},{1,0},{0,-1},{0,1}};

    public static void main(String[] args) throws IOException {

        //N, M input
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //build a matrix
        matrix = new int[n][m];
        for(int i = 0; i < n; i++){
            String line = br.readLine();
            for(int j = 0; j < m; j++){
                matrix[i][j] = line.charAt(j) - '0';
            }
        }
        //visited
        visited = new boolean[n][m];
        //count
        count = new int[n][m];
        bfs(0, 0);

        bw.write((count[n - 1][m - 1] + 1)+"");
        bw.flush();
        bw.close();
    }

//    private static void dfs(int r, int c) {
//        Stack<ArrayList<Integer>> stack = new Stack<>();
//        ArrayList<Integer> temp = new ArrayList<>();
//        temp.add(r);
//        temp.add(c);
//        stack.push(temp);
//
//        while ((!stack.isEmpty())) {
//            ArrayList<Integer> temp2 = stack.pop();
//            visited[temp2.get(0)][temp2.get(1)] = true;
//            for(int i = 0; i < direction.length; i++) {
//                int nr = (temp2.get(0)) + direction[i][0];
//                int nc = (temp2.get(1)) + direction[i][1];
//                if(nr < 0 || nr >= matrix.length || nc < 0 || nc >= matrix[0].length) continue;
//                if(!visited[nr][nc] && matrix[nr][nc] == 1) {
//                    temp = new ArrayList<>();
//                    temp.add(nr);
//                    temp.add(nc);
//                    stack.push(temp);
//                    count[nr][nc] = count[temp2.get(0)][temp2.get(1)] + 1;
//                }
//            }
//        }
//
//
//    }

    private static void bfs(int r, int c) {
        Queue<int[]> queue = new LinkedList<>();
        int[] temp = new int[2];

        temp[0] = r;
        temp[1] = c;

        queue.add(temp);
        visited[r][c] = true;
        while ((!queue.isEmpty())) {

            int[] temp2 = queue.poll();
            if (temp2.equals(new int[]{matrix.length - 1, matrix[0].length -1})){
                return;
            }

            for (int i = 0; i < direction.length; i++) {
                int nr = temp2[0] + direction[i][0];
                int nc = temp2[1] + direction[i][1];
                if (nr < 0 || nr >= matrix.length || nc < 0 || nc >= matrix[0].length) continue;
                if (!visited[nr][nc] && matrix[nr][nc] == 1) {
                    temp = new int[2];
                    temp[0] = nr;
                    temp[1] = nc;
                    queue.add(temp);
                    visited[nr][nc] = true;
                    count[nr][nc] = count[temp2[0]][temp2[1]] + 1;
                }
            }
        }
    }
}
