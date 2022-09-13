import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 탑 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {


        int n = Integer.parseInt(br.readLine());
        Stack<Integer[]> towers = new Stack<>();

        /* logic (2) => Stack 사용 */
        st = new StringTokenizer(br.readLine());

        int nextTower = 0;
        for(int i = 0; i < n; i++) {
            nextTower = Integer.parseInt(st.nextToken());
            while (!towers.isEmpty()) {
                if(towers.peek()[1] > nextTower) {

                    sb.append(towers.peek()[0] + 1).append(" ");
                    towers.push(new Integer[] {i,nextTower});

                    break;
                } else {
                    towers.pop();
                }
            }

            if(towers.isEmpty()) {
                sb.append(0).append(" ");
                towers.push(new Integer[] {i,nextTower});
            }

        }

        System.out.println(sb);
    }
}

/* logic (1) => 시간초과 */
        /*
        boolean flag = false;
        for(int i = 0; i < n; i++) {
            if(i == 0) sb.append(0).append(" ");
            else {
                for(int j = i-1; j >= 0; j--) {
                    if(towers[j] >= towers[i]) {
                        flag = true;
                        sb.append(j+1).append(" ");
                        break;
                    }
                }
                if(!flag) {
                    sb.append(0).append(" ");
                }
                flag = false;
            }
        }
         */