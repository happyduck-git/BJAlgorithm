import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소최대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //N개 정수 공백으로 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (st.hasMoreTokens()){
            int number = Integer.parseInt(st.nextToken());
            if(number < min) {
                min = number;
            }
            if(number > max) {
                max = number;
            }
        }
        System.out.println(min + " " + max);
    }
}
