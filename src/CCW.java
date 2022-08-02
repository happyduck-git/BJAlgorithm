import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CCW {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        //p1
        st = new StringTokenizer(br.readLine());
        int p1x = Integer.parseInt(st.nextToken());
        int p1y = Integer.parseInt(st.nextToken());

        //p2
        st = new StringTokenizer(br.readLine());
        int p2x = Integer.parseInt(st.nextToken());
        int p2y = Integer.parseInt(st.nextToken());

        //p1
        st = new StringTokenizer(br.readLine());
        int p3x = Integer.parseInt(st.nextToken());
        int p3y = Integer.parseInt(st.nextToken());

        //logic

        int one = p1x*p2y + p2x*p3y + p3x*p1y;
        int two = p2x*p1y + p3x*p2y + p1x*p3y;
        if((one - two) > 0 ) System.out.println(1);
        else if((one - two) < 0) System.out.println(-1);
        else System.out.println(0);

        /*
        if((p1x-p1y) == 0 && (p2x-p2y) == 0 && (p3x-p3y) == 0 ) {
            System.out.println(0);
        } else if((p3y-p1y) < p2y) {
            System.out.println(-1);
        } else if((p3y-p1y) > p2y){
            System.out.println(1);
        }

         */
    }
}







































