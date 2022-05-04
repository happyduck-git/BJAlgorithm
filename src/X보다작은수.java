import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class X보다작은수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //1st input N & X
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        //2nd input- for loop 사용하여 입력받기
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int number = Integer.parseInt(st.nextToken());
            if(number < X) {
                System.out.print(number + " ");
            }
        }
    }
}
