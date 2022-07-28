import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 세수정렬 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        while(st.hasMoreElements()) {
//            int temp = Integer.parseInt(st.nextToken());
//            if(temp < min) {
//                min = temp;
//            }
//            if(temp > max) {
//                max = temp;
//            }
//        }
//
//
    }
}
