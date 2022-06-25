import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class 카드 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //카드 숫자 n개 받기
        int n = Integer.parseInt(br.readLine());
        //for loop  돌면서 map에 key value로 받기
        Map<Long, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            long temp = Long.parseLong(br.readLine());
            if(map.containsKey(temp)){
                int originalVal = map.get(temp);
                map.replace(temp, originalVal+1);
            } else {
                map.put(temp,1);
            }
        }

        //value가 가장 큰 수 찾기
        int maxVal = Integer.MIN_VALUE;

        for(int val : map.values()) {
            if(maxVal < val) {
                maxVal = val;
            }
        }

        /*keySet을 통해서 value를 하나씩 확인할 수 있음*/
        long minKey = Long.MAX_VALUE;
        for(Long key : map.keySet()) {
            if(maxVal == map.get(key)) {
                if(key < minKey) minKey = key;
            }
        }


        br.close();
        bw.write(minKey + "");
        bw.flush();
        bw.close();

    }
}
