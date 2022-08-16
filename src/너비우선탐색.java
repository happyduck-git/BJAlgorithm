import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 너비우선탐색 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        /*input*/
        st = new StringTokenizer(br.readLine());
        int vertices = Integer.parseInt(st.nextToken());
        int edges = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken()) - 1;

            //matrix (vertex, {edges})
        Map<Integer, ArrayList<Integer>> matrix = new HashMap<>();

            //add keys and initialize ArrayLists
        for(int i = 0; i < vertices; i++) {
            matrix.put(i, new ArrayList<>());
        }

        for(int i = 0; i < edges; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken()) - 1;
            int to = Integer.parseInt(st.nextToken()) - 1;

            matrix.get(from).add(to);
            matrix.get(to).add(from);
        }

            //오름차순 정렬
        Set<Integer> keys = matrix.keySet();
        for(int key : keys) {
            Collections.sort(matrix.get(key));
        }

        /*logic*/
        boolean[] visited = new boolean[vertices];
        int[] orders = bfs(visited, matrix, start);

        //순서대로 출력
        for(int order : orders) {
            System.out.println(order);
        }

    }

    private static int[] bfs(boolean[] visited, Map<Integer, ArrayList<Integer>> matrix, int start) {
        if(visited[start]) return null;
        //declare a Queue and offer
        Queue<Integer> queue = new LinkedList<>();
        int order = 1; //탐색되는 순서를 알기위한 변수
        int[] orderArr = new int[visited.length]; //탐색 순서를 저장하기 위한 변수

        queue.offer(start);
        visited[start] = true;
        
        while(queue.size() != 0) {
            int next = queue.poll();
            orderArr[next] = order;
            order++;
            for(int i = 0; i < matrix.get(next).size(); i++) {
                if(!visited[matrix.get(next).get(i)]) {
                    queue.offer(matrix.get(next).get(i));
                    //queue에 넣을 때 방문표시 해주어야 나중에 queue에 중복으로 들어가지 않게됨
                    visited[matrix.get(next).get(i)] = true;
                }
            }
        }
        return orderArr;
    }
}
