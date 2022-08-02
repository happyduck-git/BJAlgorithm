import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
//Knapsack 관련 설명 듣고 해보기!
public class 평범한배낭 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int numberOfItems; //N
    static int maxWeight; //K
    static int[][] weightValue;
    public static void main(String[] args) throws IOException {
        //input N
        st = new StringTokenizer(br.readLine()) ;
        numberOfItems = Integer.parseInt(st.nextToken());
        //input K
        maxWeight = Integer.parseInt(st.nextToken());
        //input [][]
        weightValue = new int[numberOfItems][2];
        for(int i = 0; i < numberOfItems; i++) {
            st = new StringTokenizer(br.readLine());
            weightValue[i][0] = Integer.parseInt(st.nextToken());
            weightValue[i][1] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(weightValue, new Comparator<int[]>() {
            //무게 기준으로도 오름차순으로 정렬해보기
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) return Integer.compare(o1[0],o2[0]);
                return Integer.compare(o1[1], o2[1]);
            }
        });

        //for loop
        int valueSum = 0;
        int currentWeight = 0;
        int max = 0;
        for(int i = 0; i < numberOfItems; i++) {
            for(int j = i; j < numberOfItems; j++) {
                if(currentWeight + weightValue[j][0] <= maxWeight) {
                    currentWeight += weightValue[j][0];
                    valueSum += weightValue[j][1];
                }
                else continue;
            }
            if(valueSum > max) max = valueSum;
            valueSum = 0;
            currentWeight = 0;
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}
