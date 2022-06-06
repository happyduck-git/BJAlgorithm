import java.io.*;
import java.util.*;

public class 좌표정렬하기3 {

    /*
       출력: Print line 사용
       시간: 1656ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
            System.out.println(Arrays.toString(ints).replace(",","").replace("[","").replace("]",""));
        }

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
