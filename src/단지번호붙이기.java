import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class 단지번호붙이기 {
    static int n;
    static int[][] matrix;
    static boolean[][] visited;
    static int[][] direction = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());

        //matrix 만들기
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                matrix[i][j] = s.charAt(j) - '0';
            }
        }

        //단지 확인
        ArrayList<Integer> aptCounts = new ArrayList<>();
        visited = new boolean[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 1 && !visited[i][j]) {
                    count = 0;
                    dfs(i,j);
                    aptCounts.add(count);
                }
            }
        }

        //결과 출력
        Collections.sort(aptCounts);
        bw.write(aptCounts.size() + "\n");
        for(int i : aptCounts) {
            bw.write(i + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static void dfs(int r, int c) {
        visited[r][c]= true;
        count += 1;
        for(int[] d : direction) {
            int nr = d[0] + r;
            int nc = d[1] + c;

            if(nr >= 0 && nr < n && nc >= 0 && nc < n && matrix[nr][nc] == 1 && !visited[nr][nc]) {
                dfs(nr, nc);
            }
        }
    }


}
