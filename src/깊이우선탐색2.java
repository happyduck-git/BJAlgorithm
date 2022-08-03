import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 깊이우선탐색2 {

        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        static StringTokenizer st;
        static int[] answer;
        static int order = 0;

        public static void main(String[] args) throws IOException {


            st = new StringTokenizer(br.readLine());
            int vertices = Integer.parseInt(st.nextToken());
            int edges = Integer.parseInt(st.nextToken());
            int startVertex = Integer.parseInt(st.nextToken());

            Map<Integer, ArrayList<Integer>> matrix = new HashMap<>();
            for(int i = 0; i < vertices; i++) {
                matrix.put(i, new ArrayList<Integer>());
            }

            boolean[] visited = new boolean[vertices];

            for(int i = 0; i < edges; i++) {
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken()) - 1;
                int to = Integer.parseInt(st.nextToken()) - 1;

                matrix.get(from).add(to);
                matrix.get(to).add(from);
            }

            Set<Integer> keys = matrix.keySet();
            for(int i : keys) {
                ArrayList<Integer> values = matrix.get(i);
                Collections.sort(values);
            }


            answer = new int[vertices];

            dfs(matrix, startVertex-1, visited);

            for(int i : answer) {
                System.out.println(i);
            }
        }


        private static void dfs( Map<Integer, ArrayList<Integer>> matrix, int start, boolean[] visited) {
            if(visited[start]) return;

            visited[start] = true;
            order++;
            answer[start] = order;

            for(int i = 0; i < matrix.get(start).size(); i++) {
                if(!visited[matrix.get(start).get(i)]) {
                    dfs(matrix, matrix.get(start).get(i), visited);
                }
            }
        }


}

