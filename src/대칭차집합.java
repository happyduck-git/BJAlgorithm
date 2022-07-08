import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 대칭차집합 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        /* System in 받기*/
        //A, B 집합의 원소개수 input 받기
        st = new StringTokenizer(br.readLine());
        int numOfA = Integer.parseInt(st.nextToken());
        int numOfB = Integer.parseInt(st.nextToken());

        //A, B 집합 원소 넣기
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

            //A 먼저
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            a.add(Integer.parseInt(st.nextToken()));
        }
            //B
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            b.add(Integer.parseInt(st.nextToken()));
        }
        br.close();

        /* 내 로직 */
        ArrayList<Integer> tempB = new ArrayList<>(b);

        for(Integer i : tempB) {
            if(a.contains(i)) {
                b.remove(i);
                a.remove(i);
            }
        }

        bw.write(a.size() + b.size() + "");
        bw.flush();
        bw.close();
    }
}
