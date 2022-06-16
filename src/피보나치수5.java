import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 피보나치수5 {
    /*10870번 피보나치 수 5
        Memoization 풀이
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> memo = new ArrayList<>();
        memo.add(0);
        memo.add(1);
        System.out.println(fibonacci(memo,n));
    }

    private static int fibonacci(ArrayList<Integer> memo, int num) {
        if(memo.size() <= num) {
            memo.add(fibonacci(memo, num - 1) + fibonacci(memo, num - 2));
        }
        return memo.get(num);
    }
}
