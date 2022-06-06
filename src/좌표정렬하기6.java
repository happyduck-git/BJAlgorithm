import java.io.*;
import java.util.*;

public class 좌표정렬하기6 {
    /*
        시간: 760ms
    */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] ints = new int[n][2];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            ints[i][0] = Integer.parseInt(st.nextToken());
            ints[i][1] = Integer.parseInt(st.nextToken());
        }

        /*line#20~ 잘알아두기!*/
        Arrays.sort(ints, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]- o2[0] == 0) {
                    return Integer.compare(o1[1], o2[1]);
                }
                return Integer.compare(o1[0], o2[0]);
            }
        });

        for(int i = 0; i < ints.length; i++) {
            bw.write(ints[i][0] + " " + ints[i][1] + "\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }
}
