import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 문자열집합HashSet {

    /*14425번 문자열 집합
      HashSet 사용
      424ms
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        //n m input
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // n개의 문자열 hashSet에 넣기
        HashSet<String> nStrings = new HashSet<>();
        for(int i = 0; i < n; i++) {
            nStrings.add(br.readLine());
        }

        int count = 0;
        //set은 index로 비교가 어려우므로 바로 br.readLine() input 받으면서 비교하기!
        for(int i = 0; i < m; i++) {
            String temp = br.readLine();
            if(nStrings.contains(temp)) count++;
        }

        br.close();
        bw.write(count + "");
        bw.flush();
        bw.close();

    }
}
