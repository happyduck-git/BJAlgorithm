import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class 촌수계산 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int[][] matrix;
    static boolean[] visited;
    static int[] relationship;

    public static void main(String[] args) throws IOException {

        //num of cases
        int n = Integer.parseInt(br.readLine());
        //relationship that need to be found
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()) - 1;
        int b = Integer.parseInt(st.nextToken()) - 1;
        //num of parent-child relationship
        int m = Integer.parseInt(br.readLine());
        //build a matrix (no-directional)
        matrix = new int[n][n];

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            matrix[first -1][second - 1] = 1;
            matrix[second - 1][first - 1] = 1;

        }
        br.close();

        visited = new boolean[n];
        relationship = new int[n+1];

        dfs(a,b);

    }

    static public void dfs(int from, int to) {

        Stack<Integer> stack = new Stack<>();
        if(visited[from]) return;
        stack.push(from);
        visited[from] = true;

        while(!stack.isEmpty()) {
            int pos = stack.pop();
            if(pos == to) {
                System.out.println(relationship[pos]);
                return;
            }
            for(int i = 0; i < matrix.length; i++) {
                if(matrix[pos][i] == 1 && !visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                    relationship[i] = relationship[pos] + 1;
                }
            }

        }

        System.out.println("-1");
    }


}
