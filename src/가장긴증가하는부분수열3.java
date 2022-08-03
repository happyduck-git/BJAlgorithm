import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] memo = new int[n];

        memo[0] = 1;
        for(int i = 1; i < arr.length; i++) {
            memo[i] = 1;
            for(int j = 0; j < i; j++) {
                if(arr[j] < arr[i] && memo[i] <= memo[j]) {
                    memo[i] = memo[j] + 1;
                }
            }
        }

        int max = 0;
        for(int i : memo) {
            max = Math.max(max, i);
        }
        System.out.println(max);

    }

}




















