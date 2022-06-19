import java.io.*;
import java.util.StringTokenizer;

/*
  896ms
 */

public class 숫자카드2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[20000001];
        st = new StringTokenizer(br.readLine());
                for(int i = 0; i < n; i++) {
        int temp = Integer.parseInt(st.nextToken());
        arr[temp + 10000000]++;
        }

        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
        int temp = Integer.parseInt(st.nextToken());
        sb.append(arr[temp + 10000000]).append(" ");
        }

        br.close();
        bw.write(sb.deleteCharAt(sb.length() - 1).toString()+"");
        bw.flush();
        bw.close();
    }
}