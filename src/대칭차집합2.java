import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 대칭차집합2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        /* System in 받기*/
        //A, B 집합의 원소개수 input 받기
        st = new StringTokenizer(br.readLine());
        int numOfA = Integer.parseInt(st.nextToken());
        int numOfB = Integer.parseInt(st.nextToken());

        //A, B 집합 원소 넣기
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

            //A 먼저
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            a.add(Integer.parseInt(st.nextToken()));
        }
            //B -> 차집합 만들면서 넣기
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            Integer nextToken = Integer.parseInt(st.nextToken());
            if(a.contains(nextToken)) {
                a.remove(nextToken);
            } else {
                b.add(nextToken);
            }
        }

        System.out.println(a.size() + b.size());

    }
}
