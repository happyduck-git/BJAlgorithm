import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;


/*
    시간이 덜 걸릴 줄 알고 HashMap 사용했는데 200ms정도 더 걸림
    1076ms
 */

public class 숫자카드2_HashMap {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            Integer temp = Integer.parseInt(st.nextToken());
            if(hashMap.containsKey(temp)) {
                Integer originalVal = hashMap.get(temp);
                Integer newVal = originalVal + 1;
                hashMap.replace(temp, newVal);
            } else {
                hashMap.put(temp, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(hashMap.get(temp) == null) {
                sb.append(0).append(" ");
            } else {
                sb.append(hashMap.get(temp)).append(" ");
            }

        }

        br.close();
        bw.write(sb.deleteCharAt(sb.length() - 1).toString()+"");
        bw.flush();
        bw.close();
    }
}