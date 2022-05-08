import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //M 알기
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[M];
        //array에 점수 input 받아 넣기
        for(int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            
        }
        //find max
        int max = Integer.MIN_VALUE;
        for(int j : arr) {
            if(j > max) {
                max = j;
            }
        }
        //re-calculate each score in arr
        double sum = 0;
        for(int n : arr) {
            sum += ((double) n / (double) max) * 100;
        }
        System.out.println(sum / (double)M);
    }
}
