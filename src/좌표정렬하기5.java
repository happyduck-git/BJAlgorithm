import java.io.*;
import java.util.*;

public class 좌표정렬하기5 {

     /*
       출력: BufferedWriter 사용
       시간: 892ms
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        //Sort하기 위한 ArrayList 선언 및 생성
        ArrayList<Integer[]> arrayList = new ArrayList<>();

        //n개 줄 input 2d array에 받기
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            Integer[] list = new Integer[2];
            list[0] = Integer.parseInt(st.nextToken());
            list[1] = Integer.parseInt(st.nextToken());
            arrayList.add(list);
        }
        /* 예시:
            arrayList = {
                         {3,4},
                         {1,1},
                         {1,-1},
                         {2,2},
                         {3,3}
                       }
        */

        //별도로 comparator 익명 클래스 선언하여 파라미터로 넘겨줌!
        Collections.sort(arrayList, comp);

        for(Integer[] ints : arrayList) {
            bw.write(ints[0] + " " + ints[1] + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    static Comparator<Integer[]> comp = new Comparator<Integer[]>() {
        @Override
        public int compare(Integer[] o1, Integer[] o2) {
            int comparison = o1[0] - o2[0];
            if(comparison == 0) {
                comparison = o1[1] - o2[1];
            }
            return comparison;
        }
    };
}
