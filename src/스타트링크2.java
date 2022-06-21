import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 스타트링크 {
    static int maxFloor, current, goal;
    static int[] move;
    static int[] dir = new int[2];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        maxFloor = Integer.parseInt(st.nextToken());
        current = Integer.parseInt(st.nextToken());
        goal = Integer.parseInt(st.nextToken());

        dir[0] = Integer.parseInt(st.nextToken());
        dir[1] = -Integer.parseInt(st.nextToken());

        move = new int[maxFloor + 1];
        bfs(current);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[maxFloor + 1];

        queue.add(start);
        visited[start] = true;
        move[start] = 0;

        while(!queue.isEmpty()) {
            int pos = queue.poll();
            if(pos == goal) {
                System.out.println(move[pos]);
                return;
            }
            for(int i = 0; i < dir.length; i++) {
                int next = pos + dir[i];
                if(next > maxFloor || next < 1) continue;
                if(!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                    move[next] = move[pos] + 1;
                }
            }
        }
        System.out.println("use the stairs");
    }
}
