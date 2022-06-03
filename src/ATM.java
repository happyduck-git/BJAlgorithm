import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //input N
        int n = Integer.parseInt(br.readLine());
        //input second input
        StringTokenizer st = new StringTokenizer(br.readLine());
        //int[] to put tokens
        int[] times = new int[st.countTokens()];
        for(int i = 0; i < times.length; i++) {
            times[i] = Integer.parseInt(st.nextToken());
        }
        //sort times array
        int max = 0;
        for(int i = 0; i < times.length; i++) {
            if(times[i] > max) max = times[i];
        }
        int[] countArr = new int[max + 1];
        for(int i = 1; i < countArr.length; i++) {
            for(int time : times){
                if(i == time) countArr[i]++;
            }
            //break 할 수 있는 조건 추가했지만 시간이 오히려 증가
            int sum1 = 0;
            for(int count : countArr) {
                sum1 += count;
            }
            int sum2 = 0;
            for(int time : times) {
                sum2 += time;
            }
            if(sum1 == sum2) break;
        }
        ArrayList<Integer> sorted = new ArrayList<>();
        for(int i = 0; i < countArr.length; i++) {
            while(countArr[i] != 0) {
                sorted.add(i);
                countArr[i]--;
            }
        }
        int answer = 0;
        for(int i = 0; i < sorted.size(); i++) {
            answer += sorted.get(i) * (sorted.size() - i);
        }
        System.out.println(answer);
    }
}
