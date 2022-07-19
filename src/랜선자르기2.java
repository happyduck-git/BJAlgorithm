import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//숫자 몇 부터 연산을 시작하고, 수를 어떻게 줄여가거나 늘려갈지 판단하는 것이 필요!
//Binary search를 이용해서 값의 범위를 좁혀나간다.

public class 랜선자르기2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        //k & n input
        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        // k numbers & find maxNum among them
        int[] nums = new int[k];
        int max = 0;
        for(int i = 0; i < k; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            if(nums[i] > max) max = nums[i];
        }

        //binary search
        int min = 0;
        int mid = 0;
        max++; //잘 이해 안되는 부분


        while(min < max) {

            mid = (max + min) / 2 ;
            System.out.println(mid);

            int count = 0;

            for(int i = 0; i < k; i++) {
                count += (nums[i] / mid);
            }

            if(count < n) { //원하는 count보다 적다는 것은 나누는 수가 크다는 의미이므로 나누는 수를 작게 만들어주어야 한다
                max = mid;
            } else if (count == n) {
                break;
            } else { //원하는 count보다 크다는 것은 나누는 수가 작다는 의미이므로 나누는 수를 크게 만들어주어야 한다
                min = mid + 1;
            }

        }

        System.out.println(mid);
    }
}
