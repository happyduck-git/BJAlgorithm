import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나무자르기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int numOfSticks = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] sticks = new int[numOfSticks];
        int max = 0;
        for(int i = 0; i < numOfSticks; i++) {
            int length = Integer.parseInt(st.nextToken());
            sticks[i] = length;
            if(length > max) {
                max = length;
            }
        }

        binarySearch(0, max, m, sticks);

    }

    private static void binarySearch(int min, int max, int target, int[] arr) {

        while(min < max) {

            int mid = (min + max) / 2;
            long count = 0;
            for(int i : arr) {
                if((i - mid) > 0) {
                    count += i - mid;
                }

            }
            //target보다 큰 경우
            if(count >= target) {
                min = mid + 1;
            } else {
                //target보다 작은 경우
                max = mid;
            }
        }

        System.out.println(min - 1);

    }

}
