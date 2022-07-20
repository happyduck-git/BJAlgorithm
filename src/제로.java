import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        int k = Integer.parseInt(br.readLine());

        while(k > 0) {
            k--;
            int temp = Integer.parseInt(br.readLine());
            if(temp > 0) {
                stack.push(temp);
            } else {
                stack.pop();
            }
        }
        int sum = 0;
        for(int i : stack) {
            sum += i;
        }
        System.out.println(sum);
    }
}









































