import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기 {
    //1920번 수 찾기
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        //N (Number of numbers)
        int N = Integer.parseInt(br.readLine());

        //Make an array of N numbers and sort
        st = new StringTokenizer(br.readLine());
        int[] nArray = new int[N];
        for(int i = 0; i < N; i++) {
            nArray[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nArray);
        //M (Number of numbers to find)
        int M = Integer.parseInt(br.readLine());
        int count = M;

        //Compare while st hasMoreToken()
        st = new StringTokenizer(br.readLine());
        while(count > 0) {
            int low = 0;
            int high = N - 1;
            int targetToken = Integer.parseInt(st.nextToken());

            while(low <= high) {
                int middle = (low + high) / 2;
                int value = nArray[middle];
                if(value < targetToken) {
                    low = middle + 1;
                } else if(value > targetToken) {
                    high = middle - 1;
                } else {
                    System.out.println(1);
                    break;
                }
            }
            count -= 1;
            if(low > high) {
                System.out.println(0);
            }
        }
    }
}
