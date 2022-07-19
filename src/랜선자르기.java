import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 랜선자르기 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        //k & n input
        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        // k numbers
        int[] nums = new int[k];
        for(int i = 0; i < k; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        int maxNum = Arrays.stream(nums).max().orElse(0);

        int count = 0;

        while(true) {

            for(int i : nums) {
                count += i / maxNum;
            }

            if(count >= n) break;
            maxNum--;
            count = 0;

        }

        System.out.println(maxNum);

    }
}


























