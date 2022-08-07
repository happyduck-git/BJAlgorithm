import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 깊이우선탐색24480 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] orders;
    static int order;
    public static void main(String[] args) throws IOException {

        /*input*/
        st = new StringTokenizer(br.readLine());

        int vertices = Integer.parseInt(st.nextToken());
        int edges = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken()) - 1;

        Map<Integer, ArrayList<Integer>> matrix = new HashMap<>();

        for(int i = 0; i < vertices; i++) {
            matrix.put(i, new ArrayList<Integer>());
        }

        for(int i = 0; i < edges; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken()) - 1;
            int to = Integer.parseInt(st.nextToken()) - 1;

            matrix.get(from).add(to);
            matrix.get(to).add(from);

        }

        Set<Integer> keySet = matrix.keySet();
        for(int key : keySet) {
            ArrayList<Integer> values = matrix.get(key);
            Collections.sort(values, Comparator.reverseOrder());
        }

        boolean[] visited = new boolean[vertices];
        orders = new int[vertices];
        order = 0;

        dfs(matrix, visited, start);

        for(int i : orders) {
            System.out.println(i);
        }
    }

    private static void dfs(Map<Integer, ArrayList<Integer>> matrix, boolean[] visited, int start) {
        //방문 이력 확인
        //방문 한 적 있으면 리턴
        if(visited[start]) return;
        //방문 한 적 없으면 방문 표시해주기
        visited[start] = true;
        order++;
        orders[start] = order;

        for(int i = 0; i < matrix.get(start).size(); i++) {
            if(!visited[matrix.get(start).get(i)]){
                dfs(matrix, visited, matrix.get(start).get(i));
            }
        }
    }
}
