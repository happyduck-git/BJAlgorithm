import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 영역구하기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    static int count = 0;
    static ArrayList<Integer> areas = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        /* n & m & numberOfAreas */
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[m][n];

        /* blocked areas input */
        while(k > 0) {
            k--;
            st = new StringTokenizer(br.readLine());
            int sY = Integer.parseInt(st.nextToken());
            int sX = Integer.parseInt(st.nextToken());
            int eY = Integer.parseInt(st.nextToken());
            int eX = Integer.parseInt(st.nextToken());

            for(int i = 0; i < eX-sX; i++) {
                for(int j = 0; j < eY-sY; j++) {
                    matrix[sX+i][sY+j]++;
                }
            }
        }

        /* matrix print */
//        for(int i = 0; i < m; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }

        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                dfs(matrix, i, j, visited);
                if(count != 0) {
                    areas.add(count);
                    count = 0;
                }
            }
        }

        /* out */
        areas.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        for(int area : areas) {
            sb.append(area).append(" ");
        }
        System.out.println(areas.size());
        System.out.println(sb);



    }

    public static void dfs(int[][] matrix, int x, int y, boolean[][] visited) {

        //if visited -> escape
        if(visited[x][y] || matrix[x][y] != 0) return;
        //if not visited
        visited[x][y] = true;
        count++;

        for(int i = 0; i < dir.length; i++) {
            int nr = x + dir[i][0];
            int nc = y + dir[i][1];

            if(nr < 0 || nr >= matrix.length || nc < 0 || nc >= matrix[0].length) {
                continue;
            } else {
                dfs(matrix, nr, nc, visited);
            }
        }

    }
}



















