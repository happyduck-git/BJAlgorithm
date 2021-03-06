import java.io.*;
import java.util.StringTokenizer;

public class 문자열집합 {
    /*14425번 문자열 집합
      Array 사용
      2672ms
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        //n m input
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

//        n개의 문자열 array에 넣기
        String[] nStrings = new String[n];
        for(int i = 0; i < n; i++) {
            nStrings[i] = br.readLine();
        }


//        m개의 문자열 array에 넣기
        String[] mStrings = new String[m];
        for(int i = 0; i < m; i++) {
            mStrings[i] = br.readLine();

        }

        //포함된 수 세기 위한 count 생성
        int count = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mStrings[i].equals(nStrings[j])) count++;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}
