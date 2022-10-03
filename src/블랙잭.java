import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 블랙잭 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        /* input 1 */
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        /* input 2 */
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        /* logic */
        int max = 0;
        System.out.println(blackJack(arr, max, m));
    }

    private static int blackJack(int[] arr, int max, int limit) {

        int temp = 0;
        for(int a = 0; a < arr.length-2; a++) {
            for(int b = a+1; b < arr.length-1; b++) {
                for(int c = b+1; c < arr.length; c++) {
                    temp = arr[a]+arr[b]+arr[c];
                    if(temp <= limit && temp > max) {
                        max = temp;
                    }
                }
            }
        }

        return max;
    }

}




























