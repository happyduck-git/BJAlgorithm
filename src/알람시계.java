import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알람시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //1st input
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        //2nd 시간 변환
        //H가 0시 일때와 아닌 때 나누기
        if(H == 0){
            if(M >= 45){
                M -= 45;
            } else {
                H = 23;
                M += 15;
            }
        } else {
            //H != 0
            if(M >= 45){
                M -= 45;
            } else {
                H = H - 1;
                M += 15;
            }
        }
        System.out.println(H + " " + M);
    }
}
