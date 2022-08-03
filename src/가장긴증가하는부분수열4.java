import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*이분탐색사용하여 연산 시간 단축*/
public class 가장긴증가하는부분수열4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        /*input 받기*/
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] memo = new int[n]; //DP로 값 치환할 수 있는 array 생성

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        memo[0] = arr[0]; //memo array의 0번째 원소는 arr[0]과 동일하게 배정
        int memoLength = 1;

        for (int i = 1; i < n; i++) {

            int next = arr[i]; //비교하기 위한 원소

            if (memo[memoLength - 1] < next) { // 다음 원소의 값이 더 크면 memoLength++ 하고
                memoLength++;
                memo[memoLength - 1] = next;
            }
            else { // 작거나 같으면

                int lo = 0;
                int hi = memoLength;
                while (lo < hi) {
                    int mid = (lo + hi) / 2;

                    if(memo[mid] < next) {
                        lo = mid + 1;
                    }
                    else {
                        hi = mid;
                    }

                }

                memo[lo] = next;

            }

        }

        System.out.println(memoLength);

    }

}




















