import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 큐2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        int cases = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
        while(cases > 0) {
            cases--;
            st = new StringTokenizer(br.readLine());
            String method = st.nextToken();
            switch (method) {
                case ("push"):
                    push(queue, Integer.parseInt(st.nextToken()));
                    break;
                case ("pop"):
                    pop(queue);
                    break;
                case ("size"):
                    size(queue);
                    break;
                case ("empty"):
                    empty(queue);
                    break;
                case ("front"):
                    front(queue);
                    break;
                case ("back"):
                    back(queue);
                    break;
            }

        }
        System.out.println(sb);
    }

    private static void push(Queue<Integer> queue, int n) {
        queue.offer(n);
    }

    private static void pop(Queue<Integer> queue) {
        if(queue.isEmpty()) {
            sb.append(-1).append("\n");
        } else {
            int polled = queue.poll();
            sb.append(polled).append("\n");
        }
    }

    private static void size(Queue<Integer> queue) {
        int sizeOfQueue = queue.size();
        sb.append(sizeOfQueue).append("\n");
    }

    private static void empty(Queue<Integer> queue) {
        if(queue.isEmpty()) {
            sb.append(1).append("\n");
        } else {
            sb.append(0).append("\n");
        }
    }

    private static void front(Queue<Integer> queue) {
        if(queue.isEmpty()) {
            sb.append(-1).append("\n");
        } else {
            int front = queue.peek();
            sb.append(front).append("\n");
        }
    }

    private static void back(LinkedList<Integer> queue) {
        if(queue.isEmpty()) {
            sb.append(-1).append("\n");
        } else {
            int back = queue.peekLast();
            sb.append(back).append("\n");
        }
    }
}
