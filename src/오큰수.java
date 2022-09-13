import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오큰수 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        int totalNum = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[totalNum];
        ArrayList<Integer> index = new ArrayList<>();

        stack.push(Integer.parseInt(st.nextToken()));
        index.add(0);
        int nextNum = 0;
        int poppedIndex = 0;

        for(int i = 1; i < totalNum; i++) {
            nextNum = Integer.parseInt(st.nextToken());

            while(!stack.isEmpty()) {

                if(stack.peek() < nextNum) {
                    poppedIndex = index.remove(index.size() - 1);
                    answer[poppedIndex] = nextNum;
                    stack.pop();

                } else {
                    break;
                }

            }

            stack.push(nextNum);
            index.add(i);

        }

        for(int i = 0; i < index.size(); i++) {
            answer[index.get(i)] = -1;
        }

        for(int i : answer) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }

}
