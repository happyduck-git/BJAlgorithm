import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 스타트링크2 {
    static int maxFloor, current, goal;
    static int[] move;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int up;
    static int down;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        maxFloor = Integer.parseInt(st.nextToken());
        current = Integer.parseInt(st.nextToken());
        goal = Integer.parseInt(st.nextToken());

        up = Integer.parseInt(st.nextToken());
        down = -Integer.parseInt(st.nextToken());
        move = new int[maxFloor + 1];
        bfs(current);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[maxFloor + 1];
        queue.add(start);
        visited[start] = true;


        while(!queue.isEmpty()) {
            int curr = queue.poll();
            if(curr == goal) {
                System.out.println("Move: " + move[curr]);
                System.out.println("Count: " + count);
                return;
            }

            int nextUp = curr + up;
            int nextDown = curr + down;

            if(nextUp <= maxFloor && !visited[nextUp]) {
                queue.offer(nextUp);
                visited[nextUp] = true;
                move[nextUp] = move[curr] + 1;
                count++;
            }
            if(nextDown >= 1 && !visited[nextDown]) {
                queue.offer(nextDown);
                visited[nextDown] = true;
                move[nextDown] = move[curr] + 1;
                count++;
            }
        }
        System.out.println("use the stairs");
    }
}
