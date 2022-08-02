import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//리팩토링 해보기
public class AMC호텔 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        //num of test cases
        int t = Integer.parseInt(br.readLine());

        //loop for t times
        while(t > 0) {
            t--;
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            System.out.println(calculator(h,w,n));

        }


    }

    private static String calculator(int h, int w, int n) {
        StringBuilder sb = new StringBuilder();
        int front = 0;
        int rear = 0;
        if(n % h == 0) {
            rear = n / h;
            front = h;
            sb.append(front);
            if(rear < 10) {
                sb.append(0);
            }
            sb.append(rear);
        } else {
            rear = (n / h) + 1;
            front = (n % h);
            sb.append(front);
            if(rear < 10) {
                sb.append(0);
            }
            sb.append(rear);
        }
        return sb.toString();
    }
}












