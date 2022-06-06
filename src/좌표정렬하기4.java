import java.io.*;
import java.util.*;

public class 좌표정렬하기4 {

    /*
       출력: StringBuilder 사용
       시간: 1012ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer[]> arrayList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            Integer[] list = new Integer[2];
            list[0] = Integer.parseInt(st.nextToken());
            list[1] = Integer.parseInt(st.nextToken());
            arrayList.add(list);
        }

        Collections.sort(arrayList, comp);

        for(Integer[] ints : arrayList) {
            sb.append(Arrays.toString(ints).replace(",","").replace("[","").replace("]","") + "\n");
        }
        System.out.println(sb);

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
