import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 최소힙 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        int numOfInput = Integer.parseInt(br.readLine());

        PriorityQueue priorityQueue = new PriorityQueue<>();

        while(numOfInput > 0) {
            numOfInput--;
            int temp = Integer.parseInt(br.readLine());

            if(temp == 0) {
                if(priorityQueue.size() == 0) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(priorityQueue.remove()).append("\n");
                }
            } else {
                priorityQueue.add(temp);
            }
        }

        System.out.println(sb);
    }
}
































